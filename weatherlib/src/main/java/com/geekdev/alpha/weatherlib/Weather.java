package com.geekdev.alpha.weatherlib;


/**
 * Created by Alpha.
 */

import com.geekdev.alpha.weatherlib.models.Request;
import com.geekdev.alpha.weatherlib.models.WeatherResponse;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

public interface Weather {

    @GET("/{request}")
    void getWeather(@Path("request") Request params, @QueryMap Map<String, String> query, Callback<WeatherResponse> cb);

    @GET("/{request}")
    Observable<WeatherResponse> getWeather(@Path("request") Request params, @QueryMap Map<String, String> query);

}
