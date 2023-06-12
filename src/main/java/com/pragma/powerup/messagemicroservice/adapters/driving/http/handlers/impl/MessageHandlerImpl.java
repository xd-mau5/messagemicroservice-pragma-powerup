package com.pragma.powerup.messagemicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.messagemicroservice.adapters.driving.http.dto.request.MessageRequestDto;
import com.pragma.powerup.messagemicroservice.adapters.driving.http.handlers.IMessageHandler;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;
import io.github.cdimascio.dotenv.Dotenv;

@Service
public class MessageHandlerImpl implements IMessageHandler {
    static Dotenv dotenv = Dotenv.load();
    public static final String ACCOUNT_SID = dotenv.get("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = dotenv.get("TWILIO_AUTH_TOKEN");
    public static final String TWILIO_PHONE_NUMBER = dotenv.get("TWILIO_PHONE_NUMBER");

    @Override
    public String send(MessageRequestDto messageRequestDto) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message messageSent = Message.creator(
                // to
                new PhoneNumber(messageRequestDto.getReceiver()),
                // from
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                messageRequestDto.getMessage())
                .create();
        return messageSent.getSid();
    }
}
