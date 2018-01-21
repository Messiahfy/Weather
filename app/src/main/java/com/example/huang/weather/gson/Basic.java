package com.example.huang.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huang on 18-1-20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
