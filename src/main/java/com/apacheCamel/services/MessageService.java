package com.apacheCamel.services;

import com.apacheCamel.models.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public void transform(Message message) {
        message.setId(message.getId() * 10);
        message.setContent(message.getContent() + " has been changed.");
    }
}
