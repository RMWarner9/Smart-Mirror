package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FeelsLike class holds temperature values in Kelvin that are populated by the openweathermap api
 */
public class FeelsLike{
    @JsonProperty("day")
    private double day;
    @JsonProperty("night")
    private double night;
    @JsonProperty("eve")
    private double eve;
    @JsonProperty("morn")
    private double morn;
}

