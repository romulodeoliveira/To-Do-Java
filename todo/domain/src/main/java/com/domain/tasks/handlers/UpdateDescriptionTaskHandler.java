package com.domain.tasks.handlers;

import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;
import com.domain.tasks.commands.inputs.UpdateDescriptionTaskCommand;
import com.domain.tasks.commands.outputs.UpdateDescriptionTaskCommandResult;
import com.domain.tasks.entities.Task;
import com.domain.tasks.repositories.ITaskRepository;

public class UpdateDescriptionTaskHandler implements
        ICommandHandler<UpdateDescriptionTaskCommand> {
    private final ITaskRepository _taskRepository;

    public UpdateDescriptionTaskHandler(ITaskRepository taskRepository) {
        _taskRepository = taskRepository;
    }

    public ICommandResult handle(UpdateDescriptionTaskCommand command) {
        // pegar a task
        Task task = _taskRepository.getById(command.taskId);

        // atualizar a descrição
        task.updadeDescription(command.description);

        // aplicar as validações
        if (task.validate().isValid() == false)
        {
            return (ICommandResult) task.validate().getErrors();
        }

        // retornar o resultado para o usuário
        return new UpdateDescriptionTaskCommandResult(
                task.getTitle(),
                task.getDescription());
    }
}
