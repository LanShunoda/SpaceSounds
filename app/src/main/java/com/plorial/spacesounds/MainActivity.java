package com.plorial.spacesounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.plorial.spacesounds.model.Model;
import com.plorial.spacesounds.model.ModelImpl;
import com.plorial.spacesounds.model.pojo.Track;

import java.util.Arrays;
import java.util.List;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Model model = new ModelImpl();
        model.searchSound(null).subscribe(new Consumer<List<Track>>() {
            @Override
            public void accept(List<Track> tracks) throws Exception {
                System.out.println(tracks.get(0).getTitle());
            }
        });
    }
}
