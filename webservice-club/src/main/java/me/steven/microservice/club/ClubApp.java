package me.steven.microservice.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Steven on 2017/1/11.
 */
@EnableEurekaClient
@SpringBootApplication
public class ClubApp {

    public static void main(String[] args) {
        SpringApplication.run(ClubApp.class);
    }

}
