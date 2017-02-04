package me.steven.microservice.club.web;

import me.steven.microservice.club.domain.Club;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven on 2017/1/11.
 */
@RestController
@RequestMapping("api")
public class ClubRestController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("")
    public String index() {
        logger.info("allo");
        return "NiHao";
    }

    @RequestMapping("list")
    public List<Club> list() {
        List<Club> clubs = new ArrayList<Club>();
        Club c1 = new Club();
        c1.setId("1");
        c1.setName("Club1");
        c1.setIntro("this is club1");
        Club c2 = new Club();
        c2.setId("2");
        c2.setName("Club2");
        c2.setIntro("this is club2");
        Club c3 = new Club();
        c3.setId("3");
        c3.setName("Club3");
        c3.setIntro("this is club3");
        clubs.add(c1);
        clubs.add(c2);
        clubs.add(c3);
        return clubs;
    }

}
