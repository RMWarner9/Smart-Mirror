package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.mc3.cis.group.mirror.services.WeatherService;


public class Clothing {

    @JsonProperty("jacket")
    private final String jacket;
    @JsonProperty("shirtType")
    private final String shirtType;
    @JsonProperty("pantType")
    private final String pantType;
    @JsonProperty("shoeType")
    private final String shoeType;

    public Clothing(WeatherService weather) {

        double maxTemp = weather.getTodaysMaxTemp();
        String jacketTemp = "";
        String shirtTemp = "";
        String pantTemp = "";
        String shoeTemp = "";

        if (weather.getRainForecast() > 0.00)
        {
            jacketTemp = "Rain jacket!";
            shoeTemp = "Rain Boots";
        }
        if(weather.getSnowForecast() > 0.00)
        {
            jacketTemp = "Bring a snow jacket!";
            shoeTemp = "Snow boots";
        }

        if(maxTemp < 50)
        {
            shirtTemp = "long sleeve";
            pantTemp = "jeans";
        }

        if(maxTemp > 50)
        {
            shirtTemp = "short sleeve";
            pantTemp = "shorts";
        }
        this.pantType = pantTemp;
        this.shirtType = shirtTemp;
        this.shoeType = shoeTemp;
        this.jacket = jacketTemp;

    }

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
