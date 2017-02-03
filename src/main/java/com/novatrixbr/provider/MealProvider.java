package com.novatrixbr.provider;

import com.novatrixbr.model.Meal;
import com.novatrixbr.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * Created by bruno on 1/31/17.
 */

@RestController
@RequestMapping("/meals")
public class MealProvider {

    @Autowired
    private MealRepository repository;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "it works!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addMeal(@RequestBody Meal meal) {
        repository.save(meal);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(meal.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
