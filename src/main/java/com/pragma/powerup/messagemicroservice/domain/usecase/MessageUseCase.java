package com.pragma.powerup.messagemicroservice.domain.usecase;

import com.pragma.powerup.messagemicroservice.domain.api.IMessageServicePort;
import com.pragma.powerup.messagemicroservice.domain.spi.IMessagePersistencePort;

public class MessageUseCase implements IMessageServicePort {
    private final IMessagePersistencePort messagePersistencePort;
    public MessageUseCase(IMessagePersistencePort messagePersistencePort) {
        this.messagePersistencePort = messagePersistencePort;
    }
    @Override
    public void sendMessage(String message, String author, String recipient) {
        messagePersistencePort.sendMessage(message, author, recipient);
    }

}
