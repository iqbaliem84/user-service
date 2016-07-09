package org.ihkhan.api.v1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.ihkhan.domain.User;
import org.ihkhan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceV1 {

    private UserRepository userRepository;

    @Autowired
    public UserServiceV1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @HystrixCommand
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
    
    @HystrixCommand
    public User save(User user) {
        return userRepository.save(user);
    }
}
