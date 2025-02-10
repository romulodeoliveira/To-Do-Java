package com.domain.tasks.commands.inputs;

import com.domain.shared.commands.interfaces.ICommand;

import java.util.UUID;

public class UpdateTitleTaskCommand implements ICommand {
    public UUID taskId;
    public String title;

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
