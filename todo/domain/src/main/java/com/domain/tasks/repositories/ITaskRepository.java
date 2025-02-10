package com.domain.tasks.repositories;

import com.domain.tasks.entities.Task;

import java.util.UUID;

public interface ITaskRepository {
    public void save(Task task);
    public Task getById(UUID id);
}
