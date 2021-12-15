package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

/**
 * Rain class hold the probability of rain at an hourly scale.
 */
public class Rain{
    @JsonProperty("1h") 
    private double _1h;
}

