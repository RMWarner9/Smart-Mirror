package edu.mc3.cis.group.mirror.services;

import edu.mc3.cis.group.mirror.models.Clothing;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ClothingService {

    public Clothing getClothing() throws IOException {
        WeatherService weatherService = new WeatherService();
        Clothing clothingRec;

        System.out.println(new Clothing(weatherService));

        return clothingRec = new Clothing(weatherService);
    }
}
