package com.kafkapractice.springboot.kafka;

import com.kafkapractice.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

//    @KafkaListener(topics = "exampleTopic", groupId = "myGroup")
//    public void consume(String message){
//        LOGGER.info(String.format("Message Received ->%s",message.toString()));
//    }

    @KafkaListener(topics = "exampleTopic", groupId = "myGroup")
    public void consume(User message){
        LOGGER.info(String.format("Message Received ->%s",message.toString()));
    }

}
