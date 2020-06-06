package com.stevanmcfc.eposprojekat;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start;
    Button about;
    Button mute;
    Button sqrt;
    Button fact;
    Button exp;
    Button nextSong;
    TextView songName;
    int songNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.bamba);
        final MediaPlayer music2 = MediaPlayer.create(MainActivity.this, R.raw.drake);
        final MediaPlayer music3 = MediaPlayer.create(MainActivity.this, R.raw.drip);
        final MediaPlayer music4 = MediaPlayer.create(MainActivity.this, R.raw.panda);
        final MediaPlayer music5 = MediaPlayer.create(MainActivity.this, R.raw.pump);
        songNumber = 1;
        music.start();
        sqrt = findViewById(R.id.sqrt);
        fact = findViewById(R.id.factor);
        exp = findViewById(R.id.exp);
        mute =  findViewById(R.id.mute);
        about = findViewById(R.id.about);
        start = findViewById(R.id.start);
        songName = findViewById(R.id.songName);
        nextSong = findViewById(R.id.nextSong);

        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(songNumber==1) {
                    if(music.isPlaying()) music.pause(); else {
                        music.start();
                    }
                } else
                if(songNumber==2) {
                    if(music2.isPlaying()) music2.pause(); else {
                        music2.start();
                    }
                } else
                if(songNumber==3) {
                    if(music3.isPlaying()) music3.pause(); else {
                        music3.start();
                    }
                } else
                if(songNumber==4) {
                    if(music4.isPlaying()) music4.pause(); else {
                        music4.start();
                    }
                } else
                if(songNumber==5) {
                    if(music5.isPlaying()) music5.pause(); else {
                        music5.start();
                    }
                }
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent star = new Intent(MainActivity.this,StartActivity.class);
                startActivity(star);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(ab);
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sq = new Intent(MainActivity.this,SqrtActivity.class);
                startActivity(sq);
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fc = new Intent(MainActivity.this,FactActivity.class);
                startActivity(fc);
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent expo = new Intent(MainActivity.this,ExpActivity.class);
                startActivity(expo);
            }
        });

        nextSong.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                try {
                    if (songNumber == 1) {
                        music.pause();
                        music2.stop();
                        music2.prepare();
                        music2.start();
                        songName.setText("Drake - God's Plan [8-Bit]");
                        songNumber = 2;
                    } else if (songNumber == 2) {
                        music2.pause();
                        music3.stop();
                        music3.prepare();
                        music3.start();
                        songName.setText("Lil Baby & Gunna - Drip Too Hard [8-Bit]");
                        songNumber = 3;
                    } else if (songNumber == 3) {
                        music3.pause();
                        music4.stop();
                        music4.prepare();
                        music4.start();
                        songName.setText("Desiigner - Panda [8-Bit]");
                        songNumber = 4;
                    } else if (songNumber == 4) {
                        music4.pause();
                        music5.stop();
                        music5.prepare();
                        music5.start();
                        songName.setText("Lil Pump & Kanye West - I Love It [8-Bit]");
                        songNumber = 5;
                    } else if (songNumber == 5) {
                        music5.pause();
                        music.stop();
                        music.prepare();
                        music.start();
                        songName.setText("Sheck Wes - Mo Bamba [8-Bit]");
                        songNumber = 1;
                    }
                } catch (Exception e) {}
            }
        });



    }




}
