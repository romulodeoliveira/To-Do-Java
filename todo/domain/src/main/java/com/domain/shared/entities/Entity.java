package com.domain.shared.entities;

import com.domain.shared.utils.ValidationResult;
import com.domain.shared.utils.ValidatorUtil;

import java.util.UUID;

public abstract class Entity {
    protected UUID id;

    protected Entity() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public ValidationResult validate() {
        return ValidatorUtil.validate(this);
    }
}
