package com.geekdev.alpha.weatherlib;

/**
 * Created by Alpha.
 */

import com.geekdev.alpha.weatherlib.models.Request;
import com.geekdev.alpha.weatherlib.models.WeatherResponse;

import retrofit.Callback;
import rx.Observable;

public class RequestBuilder {

    private Weather mWeather;

    public RequestBuilder() {
        mWeather = ForecastApi.getInstance().getRestAdapter().create(Weather.class);
    }

    public void getWeather(Request request, Callback<WeatherResponse> callback) {
        mWeather.getWeather(request, request.getQueryParams(), callback);
    }

    public Observable<WeatherResponse> getWeather(Request request) {
        return mWeather.getWeather(request, request.getQueryParams());
    }
}