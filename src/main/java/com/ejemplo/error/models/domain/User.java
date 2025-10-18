package com.ejemplo.error.models.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String lastname;

    private Role role;

    public String getRoleName(){
        return role.getName();
    }
}
