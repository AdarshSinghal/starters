package com.example.controller;

import com.example.entity.User;
import com.example.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Validated
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class UserController {
    @Autowired
    UserDataService userDataService;


    @GetMapping
    public ResponseEntity<Iterable<User>> findAll() {
        return ResponseEntity.ok(userDataService.findAll());
    }

}
