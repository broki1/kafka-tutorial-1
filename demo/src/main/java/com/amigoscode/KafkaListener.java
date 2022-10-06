package com.amigoscode;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "amigoscode", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + ":D");
    }
}
