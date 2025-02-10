package com.domain.tasks.entities;

import com.domain.identity.entities.User;
import com.domain.shared.entities.Entity;
import com.domain.shared.utils.ValidationResult;
import com.domain.shared.utils.ValidatorUtil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class Task extends Entity {
    @NotBlank(message = "O título não pode estar vazio")
    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres")
    private String title;
    @Size(max = 500, message = "O título deve ter no máximo 500 caracteres")
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isComplete;
    private User user;

    public Task(
            String title,
            String description,
            User user) {
        super();
        this.title = title;
        this.description = description;
        createdDate = LocalDateTime.now();
        updatedDate = createdDate;
        isComplete = false;
        this.user = user;
    }

    // functions
    public void updadeTitle(String title) {
        this.title = title;
        updateTimestamp();
    }

    public void updadeDescription(String description) {
        this.description = description;
        updateTimestamp();
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
        updateTimestamp();
    }

    private void updateTimestamp() {
        updatedDate = LocalDateTime.now();
    }


    // getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
