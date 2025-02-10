package com.domain.identity.commands.outputs;

import com.domain.shared.commands.interfaces.ICommandResult;

public class CreateUserCommandResult implements ICommandResult {
    private String firstName;
    private String lastName;
    private String email;

    public CreateUserCommandResult(
            String firstName,
            String lastName,
            String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
