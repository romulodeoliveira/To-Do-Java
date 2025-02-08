package com.domain.shared.entities;

import java.util.UUID;

public abstract class Entity {
    protected UUID id;

    protected Entity() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
