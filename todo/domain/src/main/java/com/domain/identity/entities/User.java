package com.domain.identity.entities;

import com.domain.identity.valueobjects.Email;
import com.domain.identity.valueobjects.Name;
import com.domain.shared.entities.Entity;

import java.time.LocalDateTime;

public class User extends Entity {
    private Name name;
    private Email email;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public User(
            Name name,
            Email email,
            LocalDateTime createdDate,
            LocalDateTime updatedDate) {
        this.name = name;
        this.email = email;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    // functions


    // getters
    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }
}
