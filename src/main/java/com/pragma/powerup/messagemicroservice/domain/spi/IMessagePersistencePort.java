package com.pragma.powerup.messagemicroservice.domain.spi;

public interface IMessagePersistencePort {
    void sendMessage(String message, String author, String recipient);
}
