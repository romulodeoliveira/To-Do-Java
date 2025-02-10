package com.domain.tasks.commands.inputs;

import com.domain.shared.commands.interfaces.ICommand;

import java.util.UUID;

public class CreateTaskCommand implements ICommand {
    public String title;
    public String description;
    public UUID userId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
