package com.javatpoint.server.main.exceptionhandling;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiError {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;

    public ApiError(HttpStatus status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
    public HttpStatus getStatus() {
        return status;
    }

}
