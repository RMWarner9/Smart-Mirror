package edu.mc3.cis.group.mirror.services;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.Clothing;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.io.IOException;

/**
 * ClothingService is a service class that does the implementation of the Clothing object to be used by the
 * ClothingController
 */
@Service
public class ClothingService {

    /**
     * getClothing is a method that returns a Clothing object by implementing a new WeatherService object that is
     * passed as a parameter for the Clothing object and returns the clothing Recommendation
     * @return
     * @throws IOException
     */
    public Clothing getClothing() {
        try {
            WeatherService weatherService = new WeatherService();
            Clothing clothingRec;

            System.out.println(new Clothing(weatherService));

            return clothingRec = new Clothing(weatherService);
        }catch (IOException e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),
                    "Unable to retrieve clothing recommendation, please check the weatherService");
        }
    }
}
