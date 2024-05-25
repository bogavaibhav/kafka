package com.kafkapractice.springboot.kafka;

import com.kafkapractice.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(com.kafkapractice.springboot.kafka.JsonKafkaConsumer.class);

    @KafkaListener(topics = "exampleJsonTopic", groupId = "myGroup")
    public void consume(User message){
        LOGGER.info(String.format("Json Message Received ->%s",message.toString()));
    }

}
