package com.ejemplo.error.services;

import com.ejemplo.error.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public Optional<User> findById(Long id) {
//        User user = null;
//        for (User u : users) {
//            if (u.getId().equals(id)) {
//                user = u;
//                break;
//            }
//        }
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }
}
