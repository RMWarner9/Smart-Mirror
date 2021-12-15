package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Temp class represents all of the temp values that are possible when calling from the openweathermap api
 *
 */
public class Temp{
    @JsonProperty("day")
    private double day;
    @JsonProperty("min")
    private double min;
    @JsonProperty("max")
    private double max;
    @JsonProperty("night")
    private double night;
    @JsonProperty("eve")
    private double eve;
    @JsonProperty("morn")
    private double morn;

    /**
     * getMid returns the minimum temp for the day
     * @return
     */
    public double getMin() {
        return min;
    }

    /**
     * getMax re
     * @return
     */
    public double getMax() {
        return max;
    }
}

