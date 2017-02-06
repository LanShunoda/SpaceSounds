package com.plorial.spacesounds.model;

import com.plorial.spacesounds.model.pojo.Track;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by plorial on 2/6/17.
 */

public interface Model {

    Observable<List<Track>> searchSound(String query);
}
