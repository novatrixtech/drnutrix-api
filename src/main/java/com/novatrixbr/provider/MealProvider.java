package com.novatrixbr.provider;

import com.novatrixbr.model.Meal;
import com.novatrixbr.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import java.net.URI;
import java.util.Calendar;
import java.util.List;

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
        meal.setDateTime(Calendar.getInstance().getTime());
        repository.save(meal);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(meal.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getMeal(@PathVariable("id") Long mealId) {
        Meal meal = repository.findOne(mealId);
        if (meal == null) {
            ResponseEntity.notFound();
        }
        return ResponseEntity.ok(meal);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity getMealsByUser(@PathVariable("userId") Long userId) {
        List<Meal> meals = repository.findMealsByUser(userId);
        return ResponseEntity.ok(meals);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    public ResponseEntity deleteLastMeal(@PathVariable("userId") Long userId) {
        repository.deleteUserLastMeal(userId);
        return ResponseEntity.ok().build();
    }

}
