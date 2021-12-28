package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

/**
 * Snow object holds the hour representation of the probability of snow
 */
public class Snow{
    @JsonProperty("1h") 
    private double _1h;
}

