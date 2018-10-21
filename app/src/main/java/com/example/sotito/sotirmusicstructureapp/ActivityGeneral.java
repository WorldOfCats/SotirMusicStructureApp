package com.example.sotito.sotirmusicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityGeneral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_music);

        ImageView data = (ImageView) findViewById(R.id.data);
        ImageView find = (ImageView) findViewById(R.id.find);
        TextView second = (TextView) findViewById(R.id.second);

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityGeneral.this, ActivityList.class);
                startActivity(i);

            }

        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityGeneral.this, Search.class);
                startActivity(i);

            }
        });

        second.setText("List:");

        ArrayList<Music> songs = new ArrayList<>();

        songs.add(new Music("song1", "artist1"));
        songs.add(new Music("song2", "artist2"));
        songs.add(new Music("song3", "artist3"));
        songs.add(new Music("song4", "artist4"));
        songs.add(new Music("song5", "artist5"));


        MusicAdapter adapterAction = new MusicAdapter(this, R.layout.elements, songs);

        ListView listView = (ListView) findViewById(R.id.list_music);

        listView.setAdapter(adapterAction);

    }

}