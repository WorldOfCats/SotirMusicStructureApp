package com.example.sotito.sotirmusicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_ac);

        ImageView library = (ImageView) findViewById(R.id.data);
        ImageView browse = (ImageView) findViewById(R.id.open);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Search.this, ActivityList.class);
                startActivity(i);

            }

        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Search.this, ActivityGeneral.class);
                startActivity(i);

            }
        });

        ArrayList<Music> music = new ArrayList<>();

        music.add(new Music("song 21", "artist 21"));
        music.add(new Music("song 22", "artist 22"));
        music.add(new Music("song 23", "artist 23"));
        music.add(new Music("song 24", "artist 24"));

        MusicAdapter adapter = new MusicAdapter(this, R.layout.elements, music);

        ListView listView = (ListView) findViewById(R.id.list_music);

        listView.setAdapter(adapter);

    }

}
