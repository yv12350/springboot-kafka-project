package org.yash.springbootkafkaproject.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProduceUserDataInfoService {
    @Autowired
    ObjectMapper objectMapper;

    public void convertKafkaRequestToUserDto(String request) throws JsonProcessingException {
        RequestDto requestDto = objectMapper.readValue(request, RequestDto.class);
        log.info("Final Data Received: "+requestDto.toString());

    }
}
