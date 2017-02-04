package me.steven.microservice.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Steven on 2017/1/10.
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class UserApp {

    @Bean
    @LoadBalanced
    RestTemplate rest() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }

}
