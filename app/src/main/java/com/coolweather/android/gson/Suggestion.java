package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Caojiehang on 2018-03-19.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
