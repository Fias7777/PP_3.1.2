package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    User update(User user);

    void deleteById(Long id);

    User findById(Long id);

    List<User> findAll();
}
