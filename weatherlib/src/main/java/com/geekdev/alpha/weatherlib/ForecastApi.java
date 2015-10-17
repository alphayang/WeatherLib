package com.geekdev.alpha.weatherlib;

import retrofit.RestAdapter;

/**
 * Created by Alpha.
 */
public class ForecastApi {
    private static ForecastApi mInstance = null;
    private RestAdapter mRestAdapter;

    private static final String BASE_API_URL = "https://api.forecast.io/forecast/";

    public static ForecastApi getInstance() {
        return mInstance;
    }

    public RestAdapter getRestAdapter() {
        return mRestAdapter;
    }

    public static void create(String apiKey) {
        mInstance = new ForecastApi(apiKey);
    }

    private ForecastApi(String apiKey) {
        String apiUrl = BASE_API_URL + apiKey;

        mRestAdapter = new RestAdapter.Builder()
                .setEndpoint(apiUrl)
                .build();
    }
}
