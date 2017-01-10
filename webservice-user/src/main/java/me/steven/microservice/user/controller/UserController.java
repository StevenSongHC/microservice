package me.steven.microservice.user.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Steven on 2017/1/10.
 */
@RestController
public class UserController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        logger.info("HIHIHI");
        return "Greeting";
    }

}
