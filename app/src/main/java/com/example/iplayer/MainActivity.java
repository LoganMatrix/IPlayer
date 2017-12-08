package com.example.iplayer;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iplayer.R;
import com.aliletter.iplayer.widget.IPlayer;

public class MainActivity extends AppCompatActivity {
    IPlayer iPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPlayer = (IPlayer) findViewById(R.id.iPlayer);
        iPlayer.setCover(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                .setVideoUrl("http://gslb.miaopai.com/stream/~t7hYwFO974U4fDLTI3basB81DRAFPYTMjdPgw__.mp4?mpflag=64&vend=1&os=3&partner=4&platform=2&cookie_id=&refer=miaopai&scid=%7Et7hYwFO974U4fDLTI3basB81DRAFPYTMjdPgw__");
    }

    @Override
    protected void onResume() {
        super.onResume();
        iPlayer.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        iPlayer.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iPlayer.onDestroy();

    }
}
