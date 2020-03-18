package org.nissan.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FootballApi {

    public static void main(String[] args) {

        SpringApplication.run(FootballApi.class,args);
    }
}
