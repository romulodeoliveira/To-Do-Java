package com.domain.tasks.handlers;

import com.domain.identity.entities.User;
import com.domain.identity.repositories.IUserRepository;
import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;
import com.domain.tasks.commands.inputs.CreateTaskCommand;
import com.domain.tasks.commands.outputs.CreateTaskCommandResult;
import com.domain.tasks.entities.Task;
import com.domain.tasks.repositories.ITaskRepository;

public class TaskHandler implements ICommandHandler<CreateTaskCommand> {
    private final IUserRepository _userRepository;
    private final ITaskRepository _taskRepository;

    public TaskHandler(
            IUserRepository userRepository,
            ITaskRepository taskRepository)
    {
        _userRepository = userRepository;
        _taskRepository = taskRepository;
    }

    public ICommandResult handle(CreateTaskCommand command) {
        // puxar o usuário
        User user = _userRepository.getById(command.userId);

        // criar a entidade
        Task task = new Task(
                command.title,
                command.description,
                user);

        // aplicar as validações
        if (task.validate().isValid() == false) {
            return (ICommandResult) task.validate().getErrors();
        }

        // persistir a Task
        _taskRepository.save(task);

        // retornar o resultado para o usuário
        return new CreateTaskCommandResult(
                task.getTitle(),
                task.getDescription());
    }
}
