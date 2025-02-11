package com.api.controllers;

import com.domain.identity.handlers.CreateUserHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserHandler _createUser;

    public UserController(CreateUserHandler createUser) {
        _createUser = createUser;
    }
}
