package edu.mc3.cis.group.mirror.services;

import edu.mc3.cis.group.mirror.models.AfternoonGreetings;
import edu.mc3.cis.group.mirror.models.Greetings;
import edu.mc3.cis.group.mirror.models.MorningGreetings;
import org.springframework.stereotype.Service;
import edu.mc3.cis.group.mirror.services.WeatherService;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

/**
 * GreetingService is a service that helps with the returning of Greetings
 */
@Service
public class GreetingService {

    static WeatherService weatherService;
    /**
     * getGreeting method returns a Greeting to be used by the controller
     * @return
     */
    public Greetings getGreeting() throws IOException {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if(hour < 12){
            return new MorningGreetings();
        }
        else if(hour > 12){
            Random rand = new Random();
            weatherService = new WeatherService();
            int greetingsSelector = rand.nextInt(2);
            if(greetingsSelector == 1){
                return new AfternoonGreetings();
            }
            else if(greetingsSelector == 2){
                return new AfternoonGreetings(weatherService);
            }
            return new AfternoonGreetings();
        }
        else{
            return new AfternoonGreetings();
        }
    }
}
