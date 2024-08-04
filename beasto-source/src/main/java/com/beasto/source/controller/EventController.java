package com.beasto.source.controller;

import com.beasto.source.kafka.KafkaProducer;
import com.beasto.source.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beasto/source")
public class EventController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<?> publish(@RequestBody Sales sales){
        kafkaProducer.sendMessage(sales);
        return ResponseEntity.ok("Message published successfuly...");
    }
}
