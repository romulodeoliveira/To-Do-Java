package com.domain.identity.repositories;

import com.domain.identity.entities.User;

import java.util.UUID;

public interface IUserRepository {
    public User getById(UUID id);
}
