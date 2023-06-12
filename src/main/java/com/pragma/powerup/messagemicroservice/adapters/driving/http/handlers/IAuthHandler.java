package com.pragma.powerup.messagemicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.messagemicroservice.adapters.driving.http.dto.request.LoginRequestDto;
import jakarta.validation.Valid;

import java.text.ParseException;

public interface IAuthHandler {
    String login(LoginRequestDto loginRequestDto) throws ParseException;
    String refresh(@Valid String jwtResponseDto) throws ParseException;
}
