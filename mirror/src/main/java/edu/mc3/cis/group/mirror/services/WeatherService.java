package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import edu.mc3.cis.group.mirror.models.Daily;
import edu.mc3.cis.group.mirror.models.Weather;
import edu.mc3.cis.group.mirror.models.WeatherObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.*;
import java.util.List;

@Service
public class WeatherService {

   private final WeatherObject weather;

   public WeatherService() throws IOException {

      //use jackson to map JSON string to JAVA objects
      ObjectMapper weatherObjectMapper = new ObjectMapper();
      weather = weatherObjectMapper.readValue(new URL ("https://api.openweathermap.org/data/2.5/onecall?lat=40.21&lon=-75.37&exclude=&appid=27dc2479f6b8403454c5de1d81d9931c"), WeatherObject.class);
   }


   public WeatherObject getWeather(){

      return weather;


   }//end getWeather method


   public List<Daily> getDailyForecast()
   {
     return weather.getDaily();
   }

   public Daily getTodaysForecast()
   {
      return weather.getDaily().get(0);
   }



   public double getCurrentTemp()
   {
      return tempConverter(weather.getCurrent().getTemp());
   }

   public double getTodaysMaxTemp()
   {
      return tempConverter(weather.getDaily().get(0).getTemp().getMax());
   }

   public double getRainForecast()
   {
      return weather.getDaily().get(0).getRainProbability();
   }

   public double getSnowForecast()
   {
      return weather.getDaily().get(0).getRainProbability();
   }


   private double tempConverter(double temp)
   {
      double Ftemp;
      double Ctemp;
      double Ktemp;
      Ktemp = temp;
      Ctemp = Ktemp - 273.15;
      Ftemp = ( (Ctemp * (1.8) ) + 32);
      return Ftemp;
   }

}//end class