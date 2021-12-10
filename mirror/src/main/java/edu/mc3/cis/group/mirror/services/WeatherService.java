package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import edu.mc3.cis.group.mirror.models.Weather;
import edu.mc3.cis.group.mirror.models.WeatherObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.*;

@Service
public class WeatherService {
   public WeatherObject getWeather(){
   
   //use jackson to map JSON string to JAVA objects
   ObjectMapper weatherObjectMapper = new ObjectMapper();
        
   try
   {
   
   //convert the website API URL to a string:
   String openWeather = ("https://api.openweathermap.org/data/2.5/onecall?lat=40.21&lon=-75.37&exclude=&appid=27dc2479f6b8403454c5de1d81d9931c");

   WeatherObject weather = new WeatherObject();
   weather = weatherObjectMapper.readValue(new URL ("https://api.openweathermap.org/data/2.5/onecall?lat=40.21&lon=-75.37&exclude=&appid=27dc2479f6b8403454c5de1d81d9931c"), WeatherObject.class);
   System.out.println(weather);

   System.out.println(weather.current);
   return weather;

   }//end try block
   
   catch(IOException error)//if there is an error, show it here
   {
      
      System.out.println(error.getMessage());
   
   }//end catch block

   return null;

   }//end main method
   
}//end class