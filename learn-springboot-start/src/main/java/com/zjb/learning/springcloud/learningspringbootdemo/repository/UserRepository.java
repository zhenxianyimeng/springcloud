package com.zjb.learning.springcloud.learningspringbootdemo.repository;

import com.zjb.learning.springcloud.learningspringbootdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zjb
 * @date 2017/10/29.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
