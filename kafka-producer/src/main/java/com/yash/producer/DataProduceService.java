package com.yash.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataProduceService {
    @Autowired
    KafkaTemplate<String,RequestDto> kafkaTemplate;

    public void pushDataToKafka(RequestDto requestDto){
        kafkaTemplate.send("custom-topic-1",requestDto);
    }
}
