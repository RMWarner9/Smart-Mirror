package edu.mc3.cis.group.mirror.controllers;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.*;
import edu.mc3.cis.group.mirror.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;

/**
 * WeatherController is a class that is used for RESTful services to return different Weather forecasts
 */
@RestController
@RequestMapping("weather")
public class WeatherController{

    @Autowired
    private WeatherService service;

    /**
     * getWeather() is a method that returns all of the results from the WeatherObject
     * @return WeatherObject all results
     */
    @GetMapping(path = "/currentWeather", produces = "application/json")
    public WeatherObject getWeather(){
        if(service.getWeather() == null)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "Cannot retrieve weather");
        }
            return service.getWeather();
    }

    /**
     * getDailyForecast returns a 10 day forecast for the weather
     * @return A List of the DailyForecast over 10 days
     */
    @GetMapping(path = "/dailyForecast", produces = "application/json")
    public List<Daily> getDailyForecast(){
        return service.getDailyForecast();
    }

    /**
     * getTodaysForecast is a method that returns today's Forecast
     * @return Daily today's forecast
     */
    @GetMapping(path = "/todaysForecast", produces = "application/json")
    public Daily getTodaysForcast(){
        return service.getTodaysForecast();
    }

    /**
     * getCurrentTemp is a method that returns the current temperature
     * @return double current temp
     */
    @GetMapping(path = "currentTemp", produces = "application/json")
    public double getCurrentTemp()
    {
        return service.getCurrentTemp();
    }



}