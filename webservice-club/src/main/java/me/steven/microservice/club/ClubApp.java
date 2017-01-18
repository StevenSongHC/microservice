package me.steven.microservice.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Steven on 2017/1/11.
 */
@EnableEurekaClient
@SpringBootApplication
public class ClubApp {

    @Bean
    RestTemplate rest() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ClubApp.class);
    }

}
