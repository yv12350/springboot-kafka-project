package com.yash.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class DataProducerController {

    @Autowired
    DataProduceService dataProduceService;

    @PostMapping(value = "/kafkaProduce",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity kafkaProduce(@RequestBody RequestDto json){
        dataProduceService.pushDataToKafka(json);
        return new ResponseEntity<>("Message Published Successfully",HttpStatus.OK);
    }
}
