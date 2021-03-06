package com.novatrixbr.provider;

import com.novatrixbr.model.*;
import com.novatrixbr.repository.DietTypeRepository;
import com.novatrixbr.repository.DietsRepository;
import com.novatrixbr.repository.TargetRepository;
import com.novatrixbr.repository.UserProfileRespository;
import com.novatrixbr.service.CalcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bruno on 2/2/17.
 */

@RestController
@RequestMapping("/{userProfileId}")
public class PredictionsProvider {

    @Autowired
    private CalcsService service;

    @Autowired
    private UserProfileRespository userProfileRespository;

    @Autowired
    private TargetRepository targetRepository;

    @Autowired
    private DietsRepository dietsRepository;

    @RequestMapping("/imc")
    public ResponseEntity getUserIMC(@PathVariable("userProfileId") Long userProfileId) {
        UserProfile userProfile = userProfileRespository.findByUserId(userProfileId);
        int result = service.getImc(userProfile.getWeight(), userProfile.getHeight());

        return ResponseEntity.ok("{\"imc\": " + result + "}");
    }

    @RequestMapping("/energy")
    public ResponseEntity getEnergyPrediction(@PathVariable("userProfileId") Long userProfileId) {
        UserProfile userProfile = userProfileRespository.findByUserId(userProfileId);

        if (userProfile.getTarget() != null) {
            Target userTarget = targetRepository.findOne(userProfile.getTarget());
            int predictedEnergyIngestion
                    = service.getEnergyIngestion(userProfile.getWeight(), userTarget.getValue());
            String response = "{\n\t\"energy\": " + predictedEnergyIngestion + "\n}";
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.badRequest().body("{ \n\terror: a target is required to process this operation\n }");
    }

    @RequestMapping(value = "/macro", method = RequestMethod.POST)
    public ResponseEntity getMacroPrediction(@PathVariable("userProfileId") Long userProfileId) {

        UserProfile userProfile = userProfileRespository.findOne(userProfileId);
        Target userTarget = targetRepository.findOne(userProfile.getTarget());
        Diets userDiet = dietsRepository.findDietByUserId(userProfileId);

        int energy = service.getEnergyIngestion(userProfile.getWeight(), userTarget.getValue());

        MacroData data;

        if (userDiet.getDiet() == 1) {
            data = service.getBalancedMacroDistribution(energy, userDiet.getCarbs(),
                    userDiet.getLipids(), userDiet.getProteins());

            return ResponseEntity.ok(data);

        } else if (userDiet.getDiet() == 2) {
            data = service.getLowCarbMacroDistribution(energy, userDiet.getCarbs(),
                    userDiet.getLipids(), userDiet.getProteins());

            return ResponseEntity.ok(data);
        } else if (userDiet.getDiet() == 3) {
            //TODO: get carbs, proteins, lipids provided by user
        }

        return ResponseEntity.unprocessableEntity().build();
    }

}
