package edu.mc3.cis.group.mirror.models;

import java.util.*;


public class Daily {
    public int dt;
    public int sunrise;
    public int sunset;
    public int moonrise;
    public int moonset;
    public double moon_phase;
    public Temp temp;
    public FeelsLike feels_like;
    public int pressure;
    public int humidity;
    public double dew_point;
    public double wind_speed;
    public int wind_deg;
    public double wind_gust;
    public List<Weather> weather;
    public int clouds;
    public double pop;
    public double rain;
    public double uvi;
    public double snow;


    public double getRainProbability()
    {
        return rain;
    }

    public double getSnowProbability()
    {
        return snow;
    }

    public Temp getTemp() {
        return temp;
    }
}



