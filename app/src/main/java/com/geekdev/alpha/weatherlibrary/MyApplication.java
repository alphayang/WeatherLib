package com.geekdev.alpha.weatherlibrary;

import android.app.Application;

import com.geekdev.alpha.weatherlib.ForecastApi;

/**
 * Created by Alpha.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ForecastApi.create("1c570b2190c32fdb9342b2a279568c47");
    }
}

