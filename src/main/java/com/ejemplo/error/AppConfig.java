package com.ejemplo.error;

import com.ejemplo.error.models.domain.Role;
import com.ejemplo.error.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "1A", "1B", new Role("ROLE_USER")));
        users.add(new User(2L, "2A", "2B", new Role("ROLE_USER")));
        users.add(new User(3L, "3A", "3B", new Role("ROLE_USER")));
        users.add(new User(4L, "4A", "4B", new Role("ROLE_USER")));
        users.add(new User(5L, "5A", "5B", null));
        return users;
    }
}
