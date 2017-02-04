package me.steven.microservice.user.web;

import me.steven.microservice.user.domain.User;
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
public class UserController {

    private final Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    RestTemplate rest;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("list")
    public String list(ModelMap model) {
        User[] users = rest.getForObject("http://localhost:8080/user/api/list", User[].class);
        model.put("users", users);
        return "list";
    }

}
