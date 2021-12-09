package edu.mc3.cis.group.mirror.models;

import java.util.*;
public class WeatherObject {
    public double lat;
    public double lon;
    public String timezone;
    public int timezone_offset;
    public Current current;
    public List<Minutely> minutely;
    public List<Hourly> hourly;
    public List<Daily> daily;

    @Override
    public String toString() {
        return "WeatherObject{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", timezone_offset=" + timezone_offset +
                ", current=" + current +
                ", minutely=" + minutely +
                ", hourly=" + hourly +
                ", daily=" + daily +
                '}';
    }
}

