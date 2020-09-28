package com.example.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.dou361.ijkplayer.widget.IjkVideoView;


public class front_View extends Activity {
    private static final String TAG = "front_view";
    private Button back_button;
    private IjkVideoView fullScreenView;
    private EditText url_edit;
//    private ExoPlayer exoPlayer_fullScreen;
//    private SimpleExoPlayer player;
//    private PlayerView simpleExoPlayerView1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.full_screen_layout);
        fullScreenView=findViewById(R.id.FullSreenVideo_view);

        PlayVideo.playVideo(fullScreenView,"rtmp://192.168.3.92:1935/live/test");

        back_button= this.<Button>findViewById(R.id.back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {finish();
            }
        });




    }
}
