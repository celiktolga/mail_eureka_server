package com.mailer.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MailEurekaServer {
    public static void main(String[] args) {

        SpringApplication.run(MailEurekaServer.class, args);
    }
}
