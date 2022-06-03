package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MorningGreetings is a class that chooses a greeting to be returned
 */
public class MorningGreetings implements Greetings {

    String[] greetingText = new String[12];
    @JsonProperty("greeting")
    private String greeting;

    public MorningGreetings() {
        greetingText[0] = "Good Morning!";
        greetingText[1] = "Wakey, wakey.";
        greetingText[2] = "Did you get enough sleep?";
        greetingText[3] = "It's a new day for the taking!";
        greetingText[4] = "Don't forget your keys!";
        greetingText[5] = "I'm up, I'm up!";
        greetingText[6] = "Ready to go?";
        greetingText[7] = "Wanna catch the sunrise?";
        greetingText[8] = "It's a beautiful new morning!";
        greetingText[9] = "Welcome!";
        greetingText[10] = "How do you like your coffee?";
        greetingText[11] = "Did you sleep well?";

        chooseGreeting();
    }

    /**
     * chooseGreeting() chooses a Greeting to be returned
     */
    public void chooseGreeting() {
        int random = (int)(Math.random() * greetingText.length);
        greeting = greetingText[random];
    }

    /**
     * getGreeting returns the value of the greeting chosen
     * @return String chosen greeting
     */
    public String getGreeting() {
        chooseGreeting();
        return greeting;
    }
}
