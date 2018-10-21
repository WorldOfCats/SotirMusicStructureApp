package com.example.sotito.sotirmusicstructureapp;

public class Music {

    private String mSongName;

    private String mArtistName;



    public Music(String songName, String artistName) {

        mSongName = songName;

        mArtistName = artistName;



    }

    public String takeSonglable() {

        return mSongName;

    }

    public String takeArtistlable() {

        return mArtistName;

    }


}
