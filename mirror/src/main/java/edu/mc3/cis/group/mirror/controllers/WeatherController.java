package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import edu.mc3.cis.group.mirror.models.Weather;
import edu.mc3.cis.group.mirror.models.WeatherObject;
import edu.mc3.cis.group.mirror.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("weather")
public class WeatherController{

    @Autowired
    private WeatherService service;

    @GetMapping(path = "/currentWeather", produces = "application/json")
    public WeatherObject getWeather() throws IOException {

        return service.getWeather();
    }
}
