package com.coolweather.android.gson;

/**
 * Created by Caojiehang on 2018-03-19.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
