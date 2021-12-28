package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

/**
 * Hourly class is a representation of the hourly forecast that is given by the openweathermap api
 */
public class Hourly {
    @JsonProperty("dt")
    private int dt;
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("feels_like")
    private double feels_like;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("dew_point")
    private double dew_point;
    @JsonProperty("uvi")
    private double uvi;
    @JsonProperty("clouds")
    private int clouds;
    @JsonProperty("visibility")
    private int visibility;
    @JsonProperty("wind_speed")
    private double wind_speed;
    @JsonProperty("wind_deg")
    private int wind_deg;
    @JsonProperty("wind_gust")
    private double wind_gust;
    @JsonProperty("weather")
    private List<Weather> weather;
    @JsonProperty("pop")
    private double pop;
    @JsonProperty("rain")
    private Rain rain;
    @JsonProperty("snow")
    private Snow snow;
}

