package com.pragma.powerup.messagemicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MessageRequestDto {
    @NotNull
    @NotBlank
    @NotEmpty
    private String message;
    @NotNull
    @NotBlank
    @NotEmpty
    private String receiver;
}
