package com.pragma.powerup.messagemicroservice.domain.api;

public interface IMessageServicePort {
    void sendMessage(String message, String author, String recipient);
}
