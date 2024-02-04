package com.jwt.tutorial.demo.auth;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    
    @PostMapping("/reg")
    public ResponseEntity<AuthenticationResponde> register(
        @RequestBody RegisterRequest request
        
        ) {
        
    }

    @PostMapping("/auth")
    public ResponseEntity<AuthenticationResponde> register(
        @RequestBody AutheticationRequest request
        
        ) {
        
    }
    
}
