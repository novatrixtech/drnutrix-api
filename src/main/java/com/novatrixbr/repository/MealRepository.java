package com.novatrixbr.repository;

import com.novatrixbr.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bruno on 2/1/17.
 */

@Transactional
public interface MealRepository extends CrudRepository<Meal, Long> {

}
