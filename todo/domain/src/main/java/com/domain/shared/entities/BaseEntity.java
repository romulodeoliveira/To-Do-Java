package com.domain.shared.entities;

import com.domain.shared.utils.ValidationResult;
import com.domain.shared.utils.ValidatorUtil;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public abstract class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
