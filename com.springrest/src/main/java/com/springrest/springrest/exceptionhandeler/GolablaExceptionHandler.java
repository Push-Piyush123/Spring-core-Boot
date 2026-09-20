package com.springrest.springrest.exceptionhandeler;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolablaExceptionHandler {

    // 1. NoSuchElementException
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchException(NoSuchElementException e) {

        return new ResponseEntity<>(
                "Course not found: " + e.getMessage(),
                HttpStatus.NOT_FOUND
        );
    }

    // 2. ArithmeticException
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException e) {

        return new ResponseEntity<>(
                "Arithmetic error: " + e.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    // 3. NullPointerException
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException e) {

        return new ResponseEntity<>(
                "Null value encountered",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    // 4. NumberFormatException
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException e) {

        return new ResponseEntity<>(
                "Invalid number format: " + e.getMessage(),
                HttpStatus.BAD_REQUEST
        );
    }

    // 5. IndexOutOfBoundsException
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<String> handleIndexException(IndexOutOfBoundsException e) {

        return new ResponseEntity<>(
                "Index is out of range",
                HttpStatus.BAD_REQUEST
        );
    }

    // 6. IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(
            IllegalArgumentException e) {

        return new ResponseEntity<>(
                "Invalid argument: " + e.getMessage(),
                HttpStatus.BAD_REQUEST
        );
    }
}