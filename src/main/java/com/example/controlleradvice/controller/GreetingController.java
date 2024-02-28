package com.example.controlleradvice.controller;

import com.example.controlleradvice.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class GreetingController {
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() throws NotFoundException {
        log.error("greeting@notFound");
        throw new NotFoundException(404, "404", "not found");
//        return new ResponseEntity<>("greeting", HttpStatus.OK);
    }
}
