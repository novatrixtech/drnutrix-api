package br.com.novatrixbr.repository;

import br.com.novatrixbr.model.DietType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bruno on 2/2/17.
 */
@Transactional
public interface DietTypeRepository extends CrudRepository<DietType, Long> {

}
