package com.chjweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenghj on 2017/7/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
