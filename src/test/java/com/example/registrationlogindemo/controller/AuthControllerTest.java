package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AuthControllerTest {

    UserService userService;

    @Test
    void welcome() {
        AuthController authController = new AuthController(userService);
        assertEquals("Welcome Jhon!", authController.welcome("Jhon"));
    }
}