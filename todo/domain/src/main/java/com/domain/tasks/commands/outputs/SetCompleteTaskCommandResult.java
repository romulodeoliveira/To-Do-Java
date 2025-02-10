package com.domain.tasks.commands.outputs;

import com.domain.shared.commands.interfaces.ICommandResult;

import java.util.UUID;

public class SetCompleteTaskCommandResult implements ICommandResult {
    public UUID id;
    private String title;
    private String description;
    private boolean isComplete;

    public SetCompleteTaskCommandResult(
            UUID id,
            String title,
            String description,
            boolean isComplete) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isComplete = isComplete;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
