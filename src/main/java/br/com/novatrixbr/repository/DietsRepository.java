package br.com.novatrixbr.repository;

import br.com.novatrixbr.model.Diets;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bruno on 2/2/17.
 */
@Transactional
public interface DietsRepository extends CrudRepository<Diets, Long> {

    @Query("select d from Diets d where d.user = ?1")
    Diets findDietByUserId(Long userId);
}
