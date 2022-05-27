package com.weixiao;

import java.io.Serializable;

public class Biage implements Serializable {
    private Integer Id;
    private String Name;
    private String Type;
    private String School;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        this.School = school;
    }



    public Biage() {
    }
    public Biage(Integer id, String name, String type,String school){
        this.Id = id;
        this.Name = name;
        this.Type = type;
        this.School = school;

    }




    @Override
    public String toString() {
        return "biage{" +
                "id=" + Id +
                ", name='" + Name + '\'' +
                ", type=" + Type +
                ", school='" + School + '\'' +
                '}';
    }

}