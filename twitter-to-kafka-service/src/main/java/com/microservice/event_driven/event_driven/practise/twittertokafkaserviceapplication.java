package com.microservice.event_driven.event_driven.practise;

import com.microservice.event_driven.event_driven.practise.config.Twittertokafkaserviceconfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class twittertokafkaserviceapplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(twittertokafkaserviceapplication.class);

    private final Twittertokafkaserviceconfig twittertokafkaserviceconfig;


    public twittertokafkaserviceapplication(Twittertokafkaserviceconfig configDat) {
        twittertokafkaserviceconfig = configDat;
    }

    public static void main(String[] args) {
        SpringApplication.run(twittertokafkaserviceapplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started");
        LOGGER.info(Arrays.toString(twittertokafkaserviceconfig.getTwitterkeywords().toArray(new String[0])));
        LOGGER.info(twittertokafkaserviceconfig.getWelcomeMessage());
    }
}
