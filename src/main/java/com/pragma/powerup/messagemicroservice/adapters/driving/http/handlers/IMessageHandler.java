package com.pragma.powerup.messagemicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.messagemicroservice.adapters.driving.http.dto.request.MessageRequestDto;

import java.text.ParseException;

public interface IMessageHandler {
    String send(MessageRequestDto messageRequestDto) throws ParseException;
}
