package com.example.sotito.sotirmusicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_music);

        ImageView open = (ImageView) findViewById(R.id.open);
        ImageView find = (ImageView) findViewById(R.id.find);
        TextView second = (TextView) findViewById(R.id.second);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityList.this, ActivityGeneral.class);
                startActivity(i);

            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityList.this, Search.class);
                startActivity(i);

            }
        });

        second.setText("Songs:");

        ArrayList<Music> music = new ArrayList<>();

        music.add(new Music("song 12", "artist 12"));
        music.add(new Music("song 13", "artist 13"));
        music.add(new Music("song 14", "artist 14"));
        music.add(new Music("song 15", "artist 15"));


        MusicAdapter adapter = new MusicAdapter(this, R.layout.elements, music);

        ListView listView = (ListView) findViewById(R.id.list_music);

        listView.setAdapter(adapter);

    }

}
