package com.coolweather.android.gson;

import android.arch.persistence.room.Update;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/3.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carWash;

    public Sport sport;

    public class update{
        @SerializedName("loc")
        public String updateTime;
    }

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Carwash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
