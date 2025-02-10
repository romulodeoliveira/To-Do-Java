package com.domain.identity.handlers;

import com.domain.identity.commands.inputs.CreateUserCommand;
import com.domain.identity.commands.outputs.CreateUserCommandResult;
import com.domain.identity.entities.User;
import com.domain.identity.repositories.IUserRepository;
import com.domain.identity.valueobjects.Name;
import com.domain.identity.valueobjects.UserEmail;
import com.domain.shared.commands.interfaces.ICommandHandler;
import com.domain.shared.commands.interfaces.ICommandResult;

public class CreateUserHandler implements
        ICommandHandler<CreateUserCommand> {
    private final IUserRepository _userRepository;

    public CreateUserHandler(IUserRepository userRepository) {
        _userRepository = userRepository;
    }

    public ICommandResult handle(CreateUserCommand command) {
        // criar os vo's
        Name name = new Name(
                command.firstName,
                command.lastName);

        UserEmail email = new UserEmail(
                command.email);

        // criar a entidade
        User user = new User(
                name,
                email);

        // validar
        if (name.validate().isValid() == false) {
            return (ICommandResult) name.validate().getErrors();
        }

        if (email.validate().isValid() == false) {
            return (ICommandResult) email.validate().getErrors();
        }

        // persistir
        _userRepository.save(user);

        // retornar o resultado
        return new CreateUserCommandResult(
                user.getName().getFirstName(),
                user.getName().getLastName(),
                user.getEmail().getAddress());
    }
}
