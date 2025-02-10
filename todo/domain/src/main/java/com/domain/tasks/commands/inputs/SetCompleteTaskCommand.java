package com.domain.tasks.commands.inputs;

import com.domain.shared.commands.interfaces.ICommand;

import java.util.UUID;

public class SetCompleteTaskCommand implements ICommand {
    public UUID taskId;
    public boolean isComplete;

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
