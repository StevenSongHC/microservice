package me.steven.microservice.club.web;

import me.steven.microservice.club.domain.Club;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Steven on 2017/1/19.
 */
@Controller
@RequestMapping("")
public class ClubController {

    private final Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    RestTemplate rest;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("list")
    public String list(ModelMap model) {
        Club[] clubs = rest.getForObject("http://club/api/list", Club[].class);
        model.put("clubs", clubs);
        return "list";
    }

}
