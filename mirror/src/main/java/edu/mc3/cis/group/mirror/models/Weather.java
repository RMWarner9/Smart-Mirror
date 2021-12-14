package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather{
    @JsonProperty("id")
    private int id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;

    public String getMain(){
        return main;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "\nid=" + id +
                "\n, main='" + main + '\'' +
                "\n, description='" + description + '\'' +
                "\n, icon='" + icon + '\'' +
                '}';
    }
}

