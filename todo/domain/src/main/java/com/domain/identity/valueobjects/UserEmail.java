package com.domain.identity.valueobjects;

import com.domain.shared.valueobjetcts.ValueObject;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserEmail extends ValueObject {
    @NotBlank(message = "O endereço não pode estar vazio")
    @Email(message = "Endereço de e-mail inválido")
    private String address;

    public UserEmail(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
