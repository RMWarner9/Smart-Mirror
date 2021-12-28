package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.*;

/**
 * The Daily class represents a single days forecast.
 */
public class Daily {

    @JsonProperty("dt")
    private int dt;
    @JsonProperty("sunrise")
    private int sunrise;
    @JsonProperty("sunset")
    private int sunset;
    @JsonProperty("moonrise")
    private int moonrise;
    @JsonProperty("moonset")
    private int moonset;
    @JsonProperty("moon_phase")
    private double moon_phase;
    @JsonProperty("temp")
    private Temp temp;
    @JsonProperty("feels_like")
    private FeelsLike feels_like;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("dew_point")
    private double dew_point;
    @JsonProperty("wind_speed")
    private double wind_speed;
    @JsonProperty("wind_deg")
    private int wind_deg;
    @JsonProperty("wind_gust")
    private double wind_gust;
    @JsonProperty("weather")
    private List<Weather> weather;
    @JsonProperty("clouds")
    private int clouds;
    @JsonProperty("pop")
    private double pop;
    @JsonProperty("rain")
    private double rain;
    @JsonProperty("uvi")
    private double uvi;
    @JsonProperty("snow")
    private double snow;


    /**
     * getRainProbability returns the probability of rain
     * @return double representation of rain probability
     */
    public double getRainProbability()
    {
        return rain;
    }

    /**
     * getSnowProbabilty returns the probability of snow
     * @return double probability representation of snow
     */
    public double getSnowProbability()
    {
        return snow;
    }

    /**
     * getTemp returns the temp object that can hold values such as max and min day and night time temperatures
     * @return Temp object tht represents all of the temperatures of the day.
     */
    public Temp getTemp() {
        return temp;
    }

}



