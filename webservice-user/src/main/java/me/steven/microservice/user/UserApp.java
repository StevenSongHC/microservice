package me.steven.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Steven on 2017/1/10.
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApp {


    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }

}
