package com.domain.tasks.handlers;

import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;
import com.domain.tasks.commands.inputs.UpdateTitleTaskCommand;
import com.domain.tasks.commands.outputs.UpdateTitleTaskCommandResult;
import com.domain.tasks.entities.Task;
import com.domain.tasks.repositories.ITaskRepository;

public class UpdateTitleTaskHandler implements
        ICommandHandler<UpdateTitleTaskCommand> {
    private final ITaskRepository _taskRepository;

    public UpdateTitleTaskHandler(ITaskRepository taskRepository) {
        _taskRepository = taskRepository;
    }

    public ICommandResult handle(UpdateTitleTaskCommand command) {
        // pegar a task
        Task task = _taskRepository.getById(command.taskId);

        // atualizar o título
        task.updadeTitle(command.title);

        // aplicar as validações
        if (task.validate().isValid() == false)
        {
            return (ICommandResult) task.validate().getErrors();
        }

        // retornar o resultado para o usuário
        return new UpdateTitleTaskCommandResult(
                task.getId(),
                task.getTitle());
    }
}
