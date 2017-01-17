package me.steven.microservice.user.web;

import me.steven.microservice.user.entity.User;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven on 2017/1/10.
 */
@RestController
@RequestMapping("")
public class UserRestController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("")
    public String index() {
        logger.info("HIHIHI");
        return "Greeting";
    }

    @RequestMapping("list")
    public List<User> list() {
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setId("0001");
        u1.setUsername("User1");
        u1.setPassword("user1pwd");
        User u2 = new User();
        u2.setId("0002");
        u2.setUsername("User2");
        u2.setPassword("user2pwd");
        users.add(u1);
        users.add(u2);
        return users;
    }

}
