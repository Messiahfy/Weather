package com.example.huang.weather.gson;

/**
 * Created by huang on 18-1-20.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
