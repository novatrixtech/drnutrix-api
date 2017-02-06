package com.novatrixbr.repository;

import com.novatrixbr.model.Meal;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */

@Transactional
public interface MealRepository extends CrudRepository<Meal, Long> {

    @Query("select m from #{#entityName} m where m.userId = ?1")
    List<Meal> findMealsByUser(Long userId);

    @Modifying
    @Query("delete from #{#entityName} m where m.userId = ?1 order by m.dateTime desc limit 1")
    void deleteUserLastMeal(Long userId);
}
