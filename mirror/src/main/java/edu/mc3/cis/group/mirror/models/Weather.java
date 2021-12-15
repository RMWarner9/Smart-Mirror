package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Weather class is a representation of the weather in a descriptive format
 */
public class Weather{
    @JsonProperty("id")
    private int id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;

    /**
     * getMain method returns the main weather description such as Cloudy, Rain, Sunny
     * @return String representation of the weathers main properties
     */
    public String getMain(){
        return main;
    }

    /**
     * toString method returns a String representation of the Weather object
     * @return String representation of Weather object
     */
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

