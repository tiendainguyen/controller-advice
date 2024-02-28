package com.example.controlleradvice.exceptionhandler;

import com.example.controlleradvice.exception.NotFoundException;
import com.example.controlleradvice.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerCustom {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFoundHandleException(NotFoundException ex) {
        log.error("handleException@notfound");
        return new ResponseEntity<>(ErrorResponse.builder()
                .status(ex.getStatus())
                .code(ex.getCode())
                .message(ex.getMessage()).build(),
                HttpStatus.valueOf(ex.getStatus()));
    }
}
