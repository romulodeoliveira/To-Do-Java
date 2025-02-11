package com.domain.identity.entities;

import com.domain.identity.valueobjects.UserEmail;
import com.domain.identity.valueobjects.Name;
import com.domain.shared.entities.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "first_name", nullable = false)),
            @AttributeOverride(name = "lastName", column = @Column(name = "last_name", nullable = false))
    })
    private Name name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "address", column = @Column(name = "email", nullable = false, unique = true))
    })
    private UserEmail email;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = true)
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
