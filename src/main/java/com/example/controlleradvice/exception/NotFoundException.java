package com.example.controlleradvice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotFoundException extends Throwable{
    private int status = 0;
    private String code;
    private String message;
}
