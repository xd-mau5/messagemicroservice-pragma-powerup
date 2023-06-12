package com.pragma.powerup.messagemicroservice.adapters.driving.http.controller;

import com.pragma.powerup.messagemicroservice.adapters.driving.http.dto.request.MessageRequestDto;
import com.pragma.powerup.messagemicroservice.adapters.driving.http.handlers.IMessageHandler;
import com.pragma.powerup.messagemicroservice.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Collections;
import java.util.Map;


@RestController
@RequestMapping("/message")
@SecurityRequirement(name = "jwt")
@RequiredArgsConstructor
public class MessageController {
    private final IMessageHandler messageHandler;

    @Operation(summary = "Send message",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Message sent",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "500", description = "Invalid username or password",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping(value = "/send", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> send(@Valid @RequestBody MessageRequestDto messageRequestDto) throws ParseException {
        messageHandler.send(messageRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.MESSAGE_SENT_SUCCESSFULLY));
    }
}
