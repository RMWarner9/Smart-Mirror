package edu.mc3.cis.group.mirror.models;

public class Weather{
    public int id;
    public String main;
    public String description;
    public String icon;

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

