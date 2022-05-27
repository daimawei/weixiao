package com.weixiao;


import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String name;
    private String type;
    private String school;

    public User(){

    }
    public User(int id, String name, String type, String school){
        this.id = id;
        this.name = name;
        this.type = type;
        this.school = school;

    }

    public User(String name, String type, String school) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    //重写tostring方法
    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name ='" + name + '\''+
                ", type ='" + type + '\''+
                ", school ='" + school +'\''+
                '}';
    }


}
