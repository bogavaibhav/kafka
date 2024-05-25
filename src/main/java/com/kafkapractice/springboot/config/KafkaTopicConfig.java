package com.kafkapractice.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myexampleTopic(){
        return TopicBuilder.name("exampleTopic").build();
    }

    @Bean
    public NewTopic myexampleJsonTopic(){
        return TopicBuilder.name("exampleJsonTopic").build();
    }

}
