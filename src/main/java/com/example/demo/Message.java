package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
    private String sender;
    private String channelId;
    private String data;
}
