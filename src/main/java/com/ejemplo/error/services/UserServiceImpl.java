package com.ejemplo.error.services;

import com.ejemplo.error.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Pepe1", "Gonzalez1", null));
        users.add(new User(2L, "Pepe2", "Gonzalez2", null));
        users.add(new User(3L, "Pepe3", "Gonzalez3", null));
        users.add(new User(4L, "Pepe4", "Gonzalez4", null));
        users.add(new User(5L, "Pepe5", "Gonzalez5", null));
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        return user;
    }
}
