package me.steven.microservice.club.entity;

/**
 * Created by steven on 1/17/17.
 */
public class Club {

    private String id;
    private String name;
    private String intro;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }

}
