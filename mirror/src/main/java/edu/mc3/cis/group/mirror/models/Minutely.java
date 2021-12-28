package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Minutely class holds a representation of the forecast by the minute and returns amount of precipitation
 */
public class Minutely{
    @JsonProperty("dt")
    private int dt;
    @JsonProperty("precipitation")
    private int precipitation;
}

