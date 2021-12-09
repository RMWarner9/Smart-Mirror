package edu.mc3.cis.group.mirror.models;

import java.util.*;
public class Current {
    public int dt;
    public int sunrise;
    public int sunset;
    public double temp;
    public double feels_like;
    public int pressure;
    public int humidity;
    public double dew_point;
    public double uvi;
    public int clouds;
    public int visibility;
    public double wind_speed;
    public int wind_deg;
    public double wind_gust;
    public List<Weather> weather;
    
    //constructor
    public Current(){
    this.dt = dt;
    this.sunrise = sunrise;
    this.sunset = sunset;
    this.temp = temp;
    this.feels_like = feels_like;
    this.pressure = pressure;
    this.humidity = humidity;
    this.dew_point = dew_point;
    this.uvi = uvi;
    this.clouds = clouds;
    this.visibility = visibility;
    this.wind_speed = wind_speed;
    this.wind_deg = wind_deg;
    this.wind_gust = wind_gust;
    this.weather = weather;
    
    }
    
    public double getTemp()
    {
      return temp;
    }
    
    public int getHumidity()
    {
      return humidity;
    }
    
    public List<Weather> getWeather()
    {
      return weather;
    }
}

