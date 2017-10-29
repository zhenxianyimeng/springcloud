package com.zjb.learning.springcloud.learningspringbootdemo.service;

import com.zjb.learning.springcloud.learningspringbootdemo.domain.User;
import com.zjb.learning.springcloud.learningspringbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjb
 * @date 2017/10/29.
 */
public interface UserService {

    User findOneById(Integer id);
}
