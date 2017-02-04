package com.novatrixbr.repository;

import com.novatrixbr.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bruno on 2/3/17.
 */
@Transactional
public interface FoodRepository extends CrudRepository<Food, Long> {

}
