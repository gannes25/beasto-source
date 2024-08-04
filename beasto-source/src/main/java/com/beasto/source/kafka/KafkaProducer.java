package com.beasto.source.kafka;

import com.beasto.source.model.Sales;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

   @Autowired
    private KafkaTemplate<String, Sales> kafkaTemplate;

   public void sendMessage(Sales sales)
   {
       kafkaTemplate.send("beasto.source", sales);
       log.info("Message published: {}", sales.toString());
   }

}
