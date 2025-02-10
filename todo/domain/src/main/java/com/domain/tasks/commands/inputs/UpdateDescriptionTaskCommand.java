package com.domain.tasks.commands.inputs;

import com.domain.shared.commands.interfaces.ICommand;

import java.util.UUID;

public class UpdateDescriptionTaskCommand implements ICommand {
    public UUID taskId;
    public String description;

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
