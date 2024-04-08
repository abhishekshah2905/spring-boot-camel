package com.apacheCamel.models;

import lombok.*;

@Data
@AllArgsConstructor
public class Message {
    private Integer id;
    private String content;
}
