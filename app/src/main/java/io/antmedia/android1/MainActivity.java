package io.antmedia.android1;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;

import io.antmedia.android1.liveVideoBroadcaster.*;
//import io.antmedia.android.liveVideoPlayer.LiveVideoPlayerActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * PLEASE WRITE RTMP BASE URL of the your RTMP SERVER.
     */



    public static final String RTMP_BASE_URL = "rtmp://13.127.245.187/LiveApp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(io.antmedia.android1.liveVideoBroadcaster.R.layout.activity_main);
    }

    public void openVideoBroadcaster(View view) {
        Intent i = new Intent(this, LiveVideoBroadcasterActivity.class);
        startActivity(i);
    }

    public void openVideoPlayer(View view) {
        //Intent i = new Intent(this, LiveVideoPlayerActivity.class);
        //startActivity(i);
    }
}
