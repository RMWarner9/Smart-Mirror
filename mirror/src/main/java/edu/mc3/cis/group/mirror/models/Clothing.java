package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.services.WeatherService;
import org.springframework.http.HttpStatus;

/**
 * This is a clothing class that holds clothing recommendations based on the days forecast. Specifically, the
 * maxTemp, and the snow or rain probability
 */

public class Clothing {

    @JsonProperty("jacket")
    private final String jacket;

    @JsonProperty("shirtType")
    private final String shirtType;

    @JsonProperty("pantType")
    private final String pantType;

    @JsonProperty("shoeType")
    private final String shoeType;

    /**
     * Clothing constructor takes a WeatherService object as a parameter to give clothing recommendations
     * @param weather weatherService object to return weather conditions
     */
    public Clothing(WeatherService weather) {


            double maxTemp = weather.getTodaysMaxTemp();
            String jacketTemp = "";
            String shirtTemp = "";
            String pantTemp = "";
            String shoeTemp = "";

            if (weather.getRainForecast() > 0.00) {
                jacketTemp = "Rain jacket!";
                shoeTemp = "Rain Boots";
            }
            if (weather.getSnowForecast() > 0.00) {
                jacketTemp = "Bring a snow jacket!";
                shoeTemp = "Snow boots";
            }

            if (maxTemp < 50) {
                shirtTemp = "long sleeve";
                pantTemp = "jeans";
            }

            if (maxTemp > 50) {
                shirtTemp = "short sleeve";
                pantTemp = "shorts";
            }
            this.pantType = pantTemp;
            this.shirtType = shirtTemp;
            this.shoeType = shoeTemp;
            this.jacket = jacketTemp;

            if(pantType.equals("") && shirtType.equals(""))
            {
                //Exception to be thrown if shirt and pant recommendations aren't filled
                throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),"You can't go outside naked! P.S. You should probably check your code");
            }

    }

    /**
     * toString method to return a formatted version of the Clothing object
     * @return
     */
    @Override
    public String toString() {
        return "Clothing{" +
                "jacket='" + jacket + '\'' +
                ", shirtType='" + shirtType + '\'' +
                ", pantType='" + pantType + '\'' +
                ", shoeType='" + shoeType + '\'' +
                '}';
    }
}
