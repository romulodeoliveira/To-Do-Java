package com.domain.shared.commands.interfaces;

public interface ICommandHandler<T extends ICommand> {
    ICommandResult handle(T command);
}
