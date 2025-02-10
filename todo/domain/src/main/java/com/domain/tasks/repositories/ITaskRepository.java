package com.domain.tasks.repositories;

import com.domain.tasks.entities.Task;

public interface ITaskRepository {
    public void save(Task task);
}
