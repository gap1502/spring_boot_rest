package ru.netology.spring_boot_rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.spring_boot_rest.exception.InvalidCredentials;
import ru.netology.spring_boot_rest.exception.UnauthorizedUser;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials (InvalidCredentials e) {
        return new ResponseEntity<>( "ERROR: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser (UnauthorizedUser e) {
         return new ResponseEntity<>("ERROR: " + e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
