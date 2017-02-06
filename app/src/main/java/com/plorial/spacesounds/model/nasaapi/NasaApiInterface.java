package com.plorial.spacesounds.model.nasaapi;

import android.support.annotation.Nullable;

import com.plorial.spacesounds.model.pojo.NasaResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by plorial on 2/6/17.
 */

public interface NasaApiInterface {

    @GET("sounds?")
    Observable<NasaResponse> searchSound(@Query("q") @Nullable String query,
                                          @Query("api_key") String apiKey);
}
