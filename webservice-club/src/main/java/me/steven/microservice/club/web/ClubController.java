package me.steven.microservice.club.web;

import me.steven.microservice.club.entity.Club;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by steven on 1/16/17.
 */
@Controller
@RequestMapping("")
public class ClubController {

    private final Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    RestTemplate rest;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("")
    public String index(ModelMap model) {
        model.addAttribute("msg", "nihaoma");
        return "index";
    }

    @RequestMapping("list")
    public String list(ModelMap model) {
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        Club[] clubs = rest.getForObject(url + "/rest/list", Club[].class);
        model.put("clubs", clubs);
        return "list";
    }

}
