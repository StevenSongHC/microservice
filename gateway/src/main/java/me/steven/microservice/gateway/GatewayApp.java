package me.steven.microservice.gateway;

import me.steven.microservice.gateway.filter.pre.UserPreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by steven on 1/17/17.
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApp {

    @Bean
    public UserPreFilter userPreFilter() {
        return new UserPreFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }

}
