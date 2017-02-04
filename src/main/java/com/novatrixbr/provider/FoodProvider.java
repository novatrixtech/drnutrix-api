package com.novatrixbr.provider;

import com.novatrixbr.model.Food;
import com.novatrixbr.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by bruno on 2/3/17.
 */
@RestController
@RequestMapping("/food")
public class FoodProvider {

    @Autowired
    private FoodRepository foodRepository;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity getFood(@PathVariable("id") long foodId) {
        Food food = foodRepository.findOne(foodId);
        return ResponseEntity.ok(food);
    }
}
