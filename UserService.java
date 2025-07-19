package com.example.taskmanagement.service;

import com.example.taskmanagement.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserByUsername(String username);
}