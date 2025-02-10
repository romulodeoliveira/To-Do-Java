package com.domain.tasks.handlers;

import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;
import com.domain.tasks.commands.inputs.SetCompleteTaskCommand;
import com.domain.tasks.commands.outputs.SetCompleteTaskCommandResult;
import com.domain.tasks.entities.Task;
import com.domain.tasks.repositories.ITaskRepository;

public class SetCompleteTaskHandler implements
        ICommandHandler<SetCompleteTaskCommand> {
    private final ITaskRepository _taskRepository;

    public SetCompleteTaskHandler(ITaskRepository taskRepository) {
        _taskRepository = taskRepository;
    }

    public ICommandResult handle(SetCompleteTaskCommand command) {
        // pegar a task
        Task task = _taskRepository.getById(command.taskId);

        // atualizar o título
        task.setComplete(command.isComplete);

        // aplicar as validações
        if (task.validate().isValid() == false)
        {
            return (ICommandResult) task.validate().getErrors();
        }

        // retornar o resultado para o usuário
        return new SetCompleteTaskCommandResult(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.isComplete());
    }
}
