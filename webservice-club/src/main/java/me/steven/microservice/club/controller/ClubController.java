package me.steven.microservice.club.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Steven on 2017/1/11.
 */
@RestController
@RequestMapping("/club")
public class ClubController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("")
    public String index() {
        logger.info("allo");
        return "NiHao";
    }

}
