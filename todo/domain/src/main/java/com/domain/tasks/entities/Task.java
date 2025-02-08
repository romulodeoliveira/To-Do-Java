package com.domain.tasks.entities;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isComplete;

    public Task(
            String title,
            String description) {
        this.title = title;
        this.description = description;
        this.createdDate = LocalDateTime.now();
        this.isComplete = false;
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
        setUpdatedDate();
    }

    private void setDescription(String description) {
        this.description = description;
        setUpdatedDate();
    }

    private void setUpdatedDate() {
        updatedDate = LocalDateTime.now();
    }

    private void setComplete() {
        isComplete = true;
        setUpdatedDate();
    }
}
