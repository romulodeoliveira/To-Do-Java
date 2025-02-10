package com.domain.identity.handlers;

import com.domain.identity.commands.inputs.UpdateNameUserCommand;
import com.domain.identity.commands.outputs.UpdateNameUserCommandResult;
import com.domain.identity.entities.User;
import com.domain.identity.repositories.IUserRepository;
import com.domain.identity.valueobjects.Name;
import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;

public class UpdateNameUserHandle implements
        ICommandHandler<UpdateNameUserCommand> {
    private final IUserRepository _userRepository;

    public UpdateNameUserHandle(IUserRepository userRepository) {
        _userRepository = userRepository;
    }

    public ICommandResult handle(UpdateNameUserCommand command) {
        // pegar o user
        User user = _userRepository.getById(command.userId);

        // criar o vo
        Name name = new Name(
                command.firstName,
                command.lastName);

        // atualizar o name
        user.updateName(name);

        // validar
        if (name.validate().isValid() == false) {
            return (ICommandResult) name.validate().getErrors();
        }

        // persistir
        _userRepository.save(user);

        // retornar o resultado
        return new UpdateNameUserCommandResult(
                user.getName().getFirstName(),
                user.getName().getLastName());
    }
}
