package com.ejemplo.error.services;

import com.ejemplo.error.models.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
