package com.novatrixbr.repository;

import com.novatrixbr.model.UserHabits;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */
@Transactional
public interface UserHabitsRepository extends CrudRepository<UserHabits, Long> {

    @Query("select uh from UserHabits uh where uh.user = ?1")
    List<UserHabits> getAllHabits(long userId);

    @Query(value = "SELECT * FROM uh_userhabits INTO OUTFILE '/data.csv'\n" +
            "FIELDS ENCLOSED BY '\"' TERMINATED BY ';' ESCAPED BY '\"'\n" +
            "LINES TERMINATED BY '\\r\\n' '/' WHERE user = ?1", nativeQuery = true)
    File getHabitsByUserInCSV(long userId);


}
