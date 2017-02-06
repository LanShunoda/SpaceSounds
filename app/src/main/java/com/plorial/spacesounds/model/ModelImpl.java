package com.plorial.spacesounds.model;

import com.plorial.spacesounds.model.nasaapi.NasaApiInterface;
import com.plorial.spacesounds.model.nasaapi.NasaApiModule;
import com.plorial.spacesounds.model.pojo.NasaResponse;
import com.plorial.spacesounds.model.pojo.Track;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by plorial on 2/6/17.
 */

public class ModelImpl implements Model {

    private static final String SOUND_CLOUD_API_KEY = "qMxqJuQ3CkFzpeZHjhfrTHI0QeuzHqxh";

    private NasaApiInterface nasaApiInterface = NasaApiModule.getApiInterface();

    @Override
    public Observable<List<Track>> searchSound(String query) {
        return nasaApiInterface.searchSound(query, NasaApiModule.API_KEY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<NasaResponse, Observable<List<Track>>>() {
                    @Override
                    public Observable<List<Track>> apply(NasaResponse nasaResponse) throws Exception {
                        return Observable.just(nasaResponse.getResults());
                    }
                });

    }
}
