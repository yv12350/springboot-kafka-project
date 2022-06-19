package org.yash.springbootkafkaproject.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class KafkaConsumer {

    @Autowired
    ProduceUserDataInfoService produceUserDataInfoService;

    @KafkaListener(topics = "custom-topic-1",
            groupId = "consumerGroup1"
    )
    public void consume(String data) throws JsonProcessingException {
        log.info("Message Consumed Successfully :" + data);
        produceUserDataInfoService.convertKafkaRequestToUserDto(data);
    }
}
