package com.domain.identity.valueobjects;

import com.domain.shared.valueobjetcts.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Name extends ValueObject {

    @NotBlank(message = "O nome não pode estar vazio")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "O sobrenome não pode estar vazio")
    @Column(nullable = false)
    private String lastName;

    protected Name() {}

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
