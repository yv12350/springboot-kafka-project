package com.yash.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class TopicConfig {
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("custom-topic-1")
                .build();
    }


}
