package com.novatrixbr.provider;

import com.novatrixbr.model.UserHabits;
import com.novatrixbr.repository.UserHabitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */

@RestController
@RequestMapping("/habits")
public class UserHabitsProvider {

    @Autowired
    private UserHabitsRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody UserHabits habits) {

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(habits.getId())
                .toUri();

        repository.save(habits);

        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getHabitsFromUser(@PathVariable("id") long userId) {
        List<UserHabits> habits = repository.getAllHabits(userId);

        return ResponseEntity.ok(habits);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity getCSVUserData(@PathVariable("id") long userId) {
//        File file = repository.getHabitsByUserInCSV(userId);
//        return ResponseEntity.ok(file);
//    }

}
