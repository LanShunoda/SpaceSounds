package com.plorial.spacesounds.model.nasaapi;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by plorial on 2/6/17.
 */

public class NasaApiModule {

    private final static String BASE_URL = "https://api.nasa.gov/planetary/";
    public final static String API_KEY = "2XmjP9DT7OQFzeZkNNQCHnRGBkWKYQvXpfXtvkua";

    public static NasaApiInterface getApiInterface(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(NasaApiInterface.class);
    }
}
