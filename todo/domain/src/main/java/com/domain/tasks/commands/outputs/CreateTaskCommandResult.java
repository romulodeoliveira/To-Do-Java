package com.domain.tasks.commands.outputs;

import com.domain.shared.commands.interfaces.ICommandResult;

public class CreateTaskCommandResult implements ICommandResult {
    private String title;
    private String description;

    public CreateTaskCommandResult(
            String title,
            String description) {
        this.title = title;
        this.description = description;
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
}
