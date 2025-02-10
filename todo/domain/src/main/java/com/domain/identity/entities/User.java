package com.domain.identity.entities;

import com.domain.identity.valueobjects.UserEmail;
import com.domain.identity.valueobjects.Name;
import com.domain.shared.entities.Entity;

import java.time.LocalDateTime;

public class User extends Entity {
    private Name name;
    private UserEmail email;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public User(
            Name name,
            UserEmail email) {
        this.name = name;
        this.email = email;
        this.createdDate = LocalDateTime.now();
    }

    // functions
    public void updateName(Name name) {
        this.name = name;
        updatedDate = LocalDateTime.now();
    }

    // getters
    public Name getName() {
        return name;
    }

    public UserEmail getEmail() {
        return email;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }
}
