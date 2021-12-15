
package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

/**
 * WeatherObject is a class that holds the values that are returned from the openweathermap api.
 * It holds, various values such as the location and timezone information, the current weather, weather by the minute,
 * hour, and daily, as well as any alerts that may be passed
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherObject {
    @JsonProperty("lat")
    private double latitude;
    @JsonProperty("lon")
    private double longitude;
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

    /**
     * toString method to return a formatted version of the WeatherObject to the terminal
     * @return String representation of WeatherObject
     */
    @Override
    public String toString() {
        return "WeatherObject{" +
                "\nlat=" + latitude +
                "\n, lon=" + longitude +
                "\n, timezone='" + timezone + '\'' +
                "\n, timezone_offset=" + timezone_offset +
                "\n, current=" + current +
                "\n, minutely=" + minutely +
                "\n, hourly=" + hourly +
                "\n, daily=" + daily +
                "\n, alerts= \n" + alerts +
                '}';
    }


    /**
     * getRain method returns a boolean value if the current weather has a rain probability by checking the main field
     * of the Weather object.
     * @return boolean True if rain is present, False if not.
     */
    public boolean getRain()
    {
        boolean rain = false;
        String weather = String.valueOf((current.getWeather().getMain()));
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

    /**
     * getSnow method returns a boolean if the current weather has a snow probability by checking the Weather objects main
     * field value
     * @return returns true if snow is present, false otherwise.
     */
    public boolean getSnow()
    {
        boolean snow = false;
        String weather = String.valueOf((current.getWeather().getMain()));
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

    /**
     * getDaily returns the daily weather report for a 10 day forecast.
     * @return List of Daily objects holding the 10 day forecast
     */
    public List<Daily> getDaily() {
        return daily;
    }

    /**
     * getCurrent method returns the current weather using the Current object
     * @return
     */
    public Current getCurrent()
    {
        return current;
    }


}
