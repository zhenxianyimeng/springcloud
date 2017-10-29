package com.zjb.learning.springcloud.learningspringbootdemo.service.impl;

import com.zjb.learning.springcloud.learningspringbootdemo.domain.User;
import com.zjb.learning.springcloud.learningspringbootdemo.repository.UserRepository;
import com.zjb.learning.springcloud.learningspringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjb
 * @date 2017/10/29.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOneById(Integer id) {
        return userRepository.findOne(id);
    }
}
