package com.tingliao.repository;

import com.tingliao.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dzkan on 2016/3/8.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
