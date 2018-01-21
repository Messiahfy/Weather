package com.example.huang.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huang on 18-1-20.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
