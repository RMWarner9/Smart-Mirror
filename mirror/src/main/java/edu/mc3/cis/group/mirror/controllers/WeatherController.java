package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.models.*;
import edu.mc3.cis.group.mirror.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("weather")
public class WeatherController{

    @Autowired
    private WeatherService service;

    @GetMapping(path = "/currentWeather", produces = "application/json")
    public WeatherObject getWeather() throws IOException {

        return service.getWeather();
    }

    @GetMapping(path = "/dailyForecast", produces = "application/json")
    public List<Daily> getDailyForecast() throws IOException{
        return service.getDailyForecast();
    }

    @GetMapping(path = "/todaysForecast", produces = "application/json")
    public Daily getTodaysForcast() throws IOException{
        return service.getTodaysForecast();
    }

    @GetMapping(path = "currentTemp", produces = "application/json")
    public double getCurrentTemp() throws IOException
    {
        return service.getCurrentTemp();
    }



}