package com.domain.tasks.commands.outputs;

import com.domain.shared.commands.interfaces.ICommandResult;

import java.util.UUID;

public class UpdateTitleTaskCommandResult implements ICommandResult {
    public UUID id;
    private String title;

    public UpdateTitleTaskCommandResult(
            UUID id,
            String title) {
        this.id = id;
        this.title = title;
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
}
