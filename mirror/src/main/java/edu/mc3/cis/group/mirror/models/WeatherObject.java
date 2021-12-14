package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherObject {
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezone_offset")
    private int timezone_offset;
    @JsonProperty("current")
    private Current current;
    @JsonProperty("minutely")
    private List<Minutely> minutely;
    @JsonProperty("hourly")
    private List<Hourly> hourly;
    @JsonProperty("daily")
    private List<Daily> daily;
    @JsonProperty("alerts")
    private List<Alert> alerts;

    @Override
    public String toString() {
        return "WeatherObject{" +
                "\nlat=" + lat +
                "\n, lon=" + lon +
                "\n, timezone='" + timezone + '\'' +
                "\n, timezone_offset=" + timezone_offset +
                "\n, current=" + current +
                "\n, minutely=" + minutely +
                "\n, hourly=" + hourly +
                "\n, daily=" + daily +
                "\n, alerts= \n" + alerts +
                '}';
    }


    public boolean getRain()
    {
        boolean rain = false;
        String weather = String.valueOf((current.getWeather()));
        if(weather.contains("rain") || weather.contains("Rain") || weather.contains("raining") || weather.contains("Raining"))
        {
            rain = true;
        }
        else
        {
            rain = false;
        }

        return rain;

    }

    public boolean getSnow()
    {
        boolean snow = false;
        String weather = String.valueOf((current.getWeather()));
        if(weather.contains("snow") || weather.contains("Snow") || weather.contains("snowing") || weather.contains("Snowing"))
        {
            snow = true;
        }
        else
        {
            snow = false;
        }

        return snow;
    }

    public String getWeather()
    {
        return String.valueOf(current.getWeather());
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public Current getCurrent()
    {
        return current;
    }
}
