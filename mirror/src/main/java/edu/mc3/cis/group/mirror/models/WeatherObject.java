package edu.mc3.cis.group.mirror.models;

import java.util.*;
public class WeatherObject {
    public double lat;
    public double lon;
    public String timezone;
    public int timezone_offset;
    public Current current;
    public List<Minutely> minutely;
    public List<Hourly> hourly;
    public List<Daily> daily;

    @Override
    public String toString() {
        return "WeatherObject{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", timezone_offset=" + timezone_offset +
                ", current=" + current +
                ", minutely=" + minutely +
                ", hourly=" + hourly +
                ", daily=" + daily +
                '}';
    }


    public double getCurrentTemp()
    {
        double Ftemp;
        double Ctemp;
        double Ktemp;
        Ktemp = current.temp;
        Ctemp = Ktemp + 273.15;
        Ftemp = ( (Ctemp * (9 / 5) ) + 32);
        return Ftemp;
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

