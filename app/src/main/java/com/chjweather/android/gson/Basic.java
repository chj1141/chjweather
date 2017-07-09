package com.chjweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenghj on 2017/7/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
