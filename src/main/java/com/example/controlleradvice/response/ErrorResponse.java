package com.example.controlleradvice.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private int status = 0;
    private String code;
    private String message;
}
