package com.domain.tasks.entities;

import com.domain.shared.entities.Entity;
import com.domain.shared.utils.ValidationResult;
import com.domain.shared.utils.ValidatorUtil;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Task extends Entity {
    @NotBlank(message = "O título não pode estar vazio")
    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres")
    private String title;

    @Size(max = 500, message = "O título deve ter no máximo 500 caracteres")
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isComplete;

    public Task(
            String title,
            String description) {
        super();
        this.title = title;
        this.description = description;
        createdDate = LocalDateTime.now();
        updatedDate = createdDate;
        isComplete = false;
    }

    public ValidationResult validate() {
        return ValidatorUtil.validate(this);
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

    // setters
    private void setTitle(String title) {
        this.title = title;
        updateTimestamp();
    }

    private void setDescription(String description) {
        this.description = description;
        updateTimestamp();
    }

    private void updateTimestamp() {
        updatedDate = LocalDateTime.now();
    }

    private void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
        updateTimestamp();
    }
}
