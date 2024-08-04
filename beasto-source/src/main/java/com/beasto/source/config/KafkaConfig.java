package com.beasto.source.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    public NewTopic getNewtopic() {
        return new NewTopic("beasto.source", 1, (short)1);
    }
}
