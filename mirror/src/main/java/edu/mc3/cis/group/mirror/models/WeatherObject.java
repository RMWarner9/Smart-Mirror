package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.*;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherObject {
    public double lat;
    public double lon;
    public String timezone;
    public int timezone_offset;
    public Current current;
    public List<Minutely> minutely;
    public List<Hourly> hourly;
    public List<Daily> daily;
    public List<Alert> alerts;

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


    public double getCurrentTemp()
    {
        return current.temp;
    }

    public boolean getRain()
    {
        boolean rain = false;
        String weather = String.valueOf((current.weather));
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
        String weather = String.valueOf((current.weather));
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
        return String.valueOf(current.weather);
    }


}

