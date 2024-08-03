package com.microservice.event_driven.event_driven.practise.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class Twittertokafkaserviceconfig {

    private List<String> twitterkeywords;
    private String   welcomeMessage;
}
