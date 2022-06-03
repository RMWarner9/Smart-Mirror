package edu.mc3.cis.group.mirror.models;

import edu.mc3.cis.group.mirror.services.WeatherService;

import java.util.Random;

public class AfternoonGreetings implements Greetings{


    public String greeting;
    String[] greetingsArray = new String[6];

    public AfternoonGreetings()
    {

        greetingsArray[0] = "Good afternoon!";
        greetingsArray[1] = "Looking good! ;)";
        greetingsArray[2] = "Enjoy your lunch!";
        greetingsArray[3] = "The afternoon is beautiful just like you!";
        greetingsArray[4] = "How was your day?";

        chooseGreeting();

    }
    public AfternoonGreetings(WeatherService weatherService)
    {
       String mainDescription = weatherService.getMainForecast();
       if(mainDescription.contains("rain")){
            greeting.concat("\n There is rain in the forecast. Better bring an umbrella!");
       }
       else if(mainDescription.contains("snow")) {
        greeting.concat("\n There is snow in the forecast! Bring your boots");
       }
       else if (mainDescription.contains("sunny")){
           greeting.concat("\n It's going to be a sunny day! 8)");
       }

    }

    public void chooseGreeting() {
        Random randomGreeting = new Random();
        greeting = greetingsArray[randomGreeting.nextInt(4)];
    }


}
