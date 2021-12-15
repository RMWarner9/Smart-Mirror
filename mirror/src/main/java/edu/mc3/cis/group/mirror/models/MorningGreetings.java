package edu.mc3.cis.group.mirror.models;

public class MorningGreetings extends Greetings {

    String[] greetingText = new String[12];
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
    }

    public void chooseGreeting() {
        int random = (int)(Math.random() * greetingText.length);
        greeting = greetingText[random];
    }

    public String getGreeting() {
        chooseGreeting();
        return greeting;
    }
}
