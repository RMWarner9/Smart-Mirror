package edu.mc3.cis.group.mirror.models;

/**
 * Greetings Interface is a interface that has any classes implementing the interface have to have a chooseGreeting
 * and a getGreeting method
 */
public interface Greetings {

    /**
     * abstract method to return a greeting
     * @return String greeting
     */
    abstract String getGreeting();

}
