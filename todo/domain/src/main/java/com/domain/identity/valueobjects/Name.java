package com.domain.identity.valueobjects;

import com.domain.shared.valueobjetcts.ValueObject;
import jakarta.validation.constraints.NotBlank;

public class Name extends ValueObject {
    @NotBlank(message = "O nome não pode estar vazio")
    private String firstName;
    @NotBlank(message = "O sobrenome não pode estar vazio")
    private String lastName;

    public Name(
            String firstName,
            String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // functions
    public String toString() {
        return firstName + " " + lastName;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
