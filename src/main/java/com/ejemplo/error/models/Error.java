package com.ejemplo.error.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Service
public class Error {

    private String message;
    private String error;
    private int status;
    private Date date;

}
