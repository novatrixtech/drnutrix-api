package com.novatrixbr.repository;

import com.novatrixbr.model.UserProfile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bruno on 2/2/17.
 */
@Transactional
public interface UserProfileRespository extends CrudRepository<UserProfile, Long> {

    @Query("select up from UserProfile up where up.user = ?1")
    UserProfile findByUserId(Long userId);

}
