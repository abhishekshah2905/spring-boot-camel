package com.apacheCamel.models.interfaces;

import com.apacheCamel.models.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageResponse {
    private Message message;
}
