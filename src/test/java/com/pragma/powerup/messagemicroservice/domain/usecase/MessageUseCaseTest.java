package com.pragma.powerup.messagemicroservice.domain.usecase;

import com.pragma.powerup.messagemicroservice.domain.spi.IMessagePersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class MessageUseCaseTest {
    @Mock
    private IMessagePersistencePort messagePersistencePort;

    private MessageUseCase messageUseCase;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        messageUseCase = new MessageUseCase(messagePersistencePort);
    }

    @Test
    void sendMessage() {
        String message = "Hello";
        String author = "+573002222222";
        String recipient = "+573126791586";
        messageUseCase.sendMessage(message, author, recipient);
        verify(messagePersistencePort).sendMessage(message, author, recipient);
    }
}