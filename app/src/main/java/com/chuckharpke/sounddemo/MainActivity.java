package com.chuckharpke.sounddemo;

import android.app.Activity;
import android.os.Bundle;

import android.media.MediaPlayer;
import android.view.View;


public class MainActivity extends Activity {

    MediaPlayer mplayer;

    public void playAudio(View view) {

        mplayer.start();

    }

    public void pauseAudio(View view) {

        mplayer.pause();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mplayer = MediaPlayer.create(this, R.raw.gong);
    }
}