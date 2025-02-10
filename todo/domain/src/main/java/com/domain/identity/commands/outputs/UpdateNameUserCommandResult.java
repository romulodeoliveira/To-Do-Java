package com.domain.identity.commands.outputs;

import com.domain.shared.commands.interfaces.ICommandResult;

public class UpdateNameUserCommandResult implements ICommandResult {
    private String firstName;
    private String lastName;

    public UpdateNameUserCommandResult(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
