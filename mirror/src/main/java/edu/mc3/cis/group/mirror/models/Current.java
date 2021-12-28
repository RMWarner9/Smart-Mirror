package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

/**
 * Current class represents the current weather.
 */
public class Current {
    @JsonProperty("dt")
    private int dt;
    @JsonProperty("sunrise")
    private int sunrise;
    @JsonProperty("sunset")
    private int sunset;
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
    @JsonProperty("rain")
    private Rain rain;
    @JsonProperty("snow")
    private Snow snow;
    @JsonProperty("weather")
    private List<Weather> weather;


    /**
     * getTemp method returns the current temperature in Kelvin
     * @return double
     */
    public double getTemp()
    {
      return temp;
    }

    /**
     * getHumidity returns the current humidity
     * @return
     */
    public int getHumidity()
    {
      return humidity;
    }

    /**
     * getWeather returns the first weather object of the Weather List
     * It holds values such as main (Clouds, Rain, Sunny, etc) and a description
     * @return Weather
     */
    public Weather getWeather()
    {
      return weather.get(0);
    }


    /**
     * toString method to return a formatted version of the Current object
     * @return
     */
    @Override
    public String toString() {
        return "Current{" +
                "\ndt=" + dt +
                "\n, sunrise=" + sunrise +
                "\n, sunset=" + sunset +
                "\n, temp=" + temp +
                "\n, feels_like=" + feels_like +
                "\n, pressure=" + pressure +
                "\n, humidity=" + humidity +
                "\n, dew_point=" + dew_point +
                "\n, uvi=" + uvi +
                "\n, clouds=" + clouds +
                "\n, visibility=" + visibility +
                "\n, wind_speed=" + wind_speed +
                "\n, wind_deg=" + wind_deg +
                "\n, wind_gust=" + wind_gust +
                "\n, rain=" + rain +
                "\n, snow=" + snow +
                "\n, weather=" + weather +
                '}';
        }

    }





