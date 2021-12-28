package edu.mc3.cis.group.mirror.services;

import edu.mc3.cis.group.mirror.models.Greetings;
import edu.mc3.cis.group.mirror.models.MorningGreetings;
import org.springframework.stereotype.Service;

/**
 * GreetingService is a service that helps with the returning of Greetings
 */
@Service
public class GreetingService {

    /**
     * getGreeting method returns a Greeting to be used by the controller
     * @return
     */
    public Greetings getGreeting()
    {
        return new MorningGreetings();
    }
}
