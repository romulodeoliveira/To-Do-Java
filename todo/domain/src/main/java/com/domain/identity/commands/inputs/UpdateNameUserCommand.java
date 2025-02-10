package com.domain.identity.commands.inputs;

import com.domain.shared.commands.interfaces.ICommand;

import java.util.UUID;

public class UpdateNameUserCommand implements ICommand {
    public UUID userId;
    public String firstName;
    public String lastName;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
