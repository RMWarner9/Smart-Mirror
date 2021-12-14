package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Minutely{
    @JsonProperty("dt")
    private int dt;
    @JsonProperty("precipitation")
    private int precipitation;
}

