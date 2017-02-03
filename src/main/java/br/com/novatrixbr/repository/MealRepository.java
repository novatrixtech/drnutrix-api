package br.com.novatrixbr.repository;

import br.com.novatrixbr.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */

@Transactional
public interface MealRepository extends CrudRepository<Meal, Long> {

}
