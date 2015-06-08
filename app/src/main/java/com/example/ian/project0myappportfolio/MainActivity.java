package com.example.ian.project0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {


    @OnClick(R.id.buildItBiggerApp)
    public void showBiggerToast(){
        Toast.makeText(this, "This is where my Build It Bigger App will be!", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.capstoneApp)
    public void showCapStoneToast(){
        Toast.makeText(this, "This is where my capstone will be!", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.libraryApp)
    public void showLibraryToast(){
        Toast.makeText(this, "This is where my library app will be!", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.scoresApp)
    public void showScoresToast(){
        Toast.makeText(this, "This is where my score app will be!", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.spotifyStreamerApp)
    public void showSpotifyToast(){
        Toast.makeText(this, "This is where my spotify streamer app will be!", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.XYZReaderApp)
    public void showReaderToast(){
        Toast.makeText(this, "This is where my reader app will be!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }
}
