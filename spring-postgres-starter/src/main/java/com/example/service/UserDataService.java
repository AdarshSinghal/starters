package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDataService {
    @Autowired
    UserRepository userRepository;


    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
