package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    void update(User user);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();
}
