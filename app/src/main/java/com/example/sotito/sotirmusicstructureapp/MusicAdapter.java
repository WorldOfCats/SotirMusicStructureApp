package com.example.sotito.sotirmusicstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter<W> extends ArrayAdapter<Music> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    public MusicAdapter(Activity context, int list_item, ArrayList<Music> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View element = convertView;

        if(element == null) {

            element = LayoutInflater.from(getContext()).inflate(R.layout.elements, parent, false);

        }

        Music nowPlay = getItem(position);

        TextView songV = (TextView) element.findViewById(R.id.songs_v);

        songV.setText(nowPlay.takeSonglable());

        TextView artistV = (TextView) element.findViewById(R.id.artists_v);

        artistV.setText(nowPlay.takeArtistlable());





        return element;

    }
}
