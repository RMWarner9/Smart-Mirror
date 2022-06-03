package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.Daily;
import edu.mc3.cis.group.mirror.models.Weather;
import edu.mc3.cis.group.mirror.models.WeatherObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.*;
import java.util.List;

@Service
public class WeatherService {

   private final WeatherObject weather;


   /**
    * Constructor of the WeatherService class. Latitiude and longitude values
    * are passed into a string format method that contains the URL of a specific data
    * relating to a location within the OpenWeatherAPI.
    * Essentially, it is a one call API that loads up data of a specific
    * location based off its set longitidue and latitude values
    * @throws IOException - Exception thrown if the objects values are unable to be mapped
    */
   public WeatherService() throws IOException {

      //use jackson to map JSON string to JAVA objects
      ObjectMapper weatherObjectMapper = new ObjectMapper();
      double latitude = 40.21;
      double longitude = -75.37;
      String weatherURL = String.format("https://api.openweathermap.org/data/2.5/onecall?lat=%f&lon=%f&exclude=&appid=27dc2479f6b8403454c5de1d81d9931c", latitude, longitude);

      if(weatherObjectMapper.canDeserialize(weatherObjectMapper.constructType(WeatherObject.class))) {
         weather = weatherObjectMapper.readValue(new URL(weatherURL), WeatherObject.class);
      }
      else{
         throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),
                 "Unable to map Weather Object" +
                 "Please check the URL being passed.");
      }

   }


   public WeatherObject getWeather(){

      return weather;

   }//end getWeather method

   public String getMainForecast()
   {
      return weather.getCurrent().getWeather().getMain();
   }

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
      return weather.getDaily().get(0).getSnowProbability();
   }


   private double tempConverter(double temp)
   {
      try {
         double Ftemp;
         double Ctemp;
         double Ktemp;
         Ktemp = temp;
         Ctemp = Ktemp - 273.15;
         Ftemp = ((Ctemp * (1.8)) + 32);
         return Ftemp;
      }catch (ArithmeticException exception)
      {
         throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "Error converting Temps");
      }
   }

}//end class