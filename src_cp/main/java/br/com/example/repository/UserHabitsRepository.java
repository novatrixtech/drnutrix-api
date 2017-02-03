package br.com.novatrixbr.repository;

import br.com.novatrixbr.model.UserHabits;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */
@Transactional
public interface UserHabitsRepository extends CrudRepository<UserHabits, Long> {

    @Query("select uh from UserHabits uh where uh.user = ?1")
    List<UserHabits> getAllHabits(long userId);

}
