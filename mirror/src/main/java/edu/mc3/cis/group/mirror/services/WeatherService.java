package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
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
   
   //builds a string from the website input:
   //StringBuilder output = new StringBuilder();
   
   //name the website 
   //URL url = new URL(openWeather);
   
   //open the website
   //URLConnection connection = url.openConnection();
   
   //retrieve incoming weather data as plain Java object NOT USED
   //Object JavaWeatherData = connection.getContent();
   
   //cast plain Java object to JS object NOT USED
   //JsonObject JsonWeatherData = (JsonObject) JavaWeatherData;
   
   //read input stream from website:
   //BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
   
   //create a string that will be used below to check if input from website has data
   //String line;
   
      //input from website, if not blank, gets added to the program output here
      //while( (line=reader.readLine() ) != null )
      //{
         
      //  output.append(line);
      
      //}//end while loop

   //When string builder is finished building, create a string
   //String JsonWeather = output.toString();
   
   //send the built string to jackson's object mapper
   //Root root = objectMapper.readValue((JsonWeather), Root.class);
   //ObjectMapper weatherObjectMapper = new ObjectMapper();
   WeatherObject weather = new WeatherObject();
   weather = weatherObjectMapper.readValue(new URL ("https://api.openweathermap.org/data/2.5/onecall?lat=40.21&lon=-75.37&exclude=&appid=27dc2479f6b8403454c5de1d81d9931c"), WeatherObject.class);
   System.out.println(weather);
   return weather;

   //Current currentWeather = new Current();
   //System.out.println(currentWeather.getWeather());
   
   //stops the input stream 
   //reader.close();
   //display the stringbuilder string NOT USED
   //System.out.println(output); 
   
   }//end try block
   
   catch(IOException error)//if there is an error, show it here
   {
      
      System.out.println(error.getMessage());
   
   }//end catch block

      return null;
   }//end main method
   
}//end class