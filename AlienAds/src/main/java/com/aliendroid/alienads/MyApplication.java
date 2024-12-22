package com.aliendroid.alienads;

import android.app.Application;
import android.util.Log;

import com.huawei.hms.ads.HwAds;


public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        HwAds.init(this);
    }
}