package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.dou361.ijkplayer.widget.IjkVideoView;



/*
Created by: Chen 6D
Date: 2020-9-23
*/


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_qian,button_hou,button_zuo,button_you,button_shangdi;
    private Spinner Video_Modul_Spinner;

    private static final String TAG = "MainActivity";
    private IjkVideoView simpleExoPlayerView0;



    private TextView resolutionTextView;
    Uri mp4VideoUri0 = Uri.parse("rtmp://202.69.69.180:443/webcast/bshdlive-pc");
    Uri mp4VideoUri1 = Uri.parse("http://ivi.bupt.edu.cn/hls/cctv1.m3u8");
    Uri mp4VideoUri2 = Uri.parse("http://ivi.bupt.edu.cn/hls/cctv2.m3u8");
    Uri mp4VideoUri3 = Uri.parse("http://ivi.bupt.edu.cn/hls/cctv3.m3u8");
    Uri mp4VideoUri4 = Uri.parse("http://ivi.bupt.edu.cn/hls/cctv4.m3u8");



    public static final int UPDATE_Zero_Video = 0;
    public static final int UPDATE_1st_Video = 1;
    public static final int UPDATE_2nd_Video = 2;
    public static final int UPDATE_3rd_Video = 3;
    public static final int UPDATE_4th_Video = 4;
    private Build.VERSION Util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_main);

        simpleExoPlayerView0 = findViewById(R.id.player_view0);

        //监听按钮
        button_qian= (Button)findViewById(R.id.qian_Click);
        button_hou = (Button)findViewById(R.id.hou_Click);
        button_zuo= (Button)findViewById(R.id.zuo_Click);
        button_you= (Button)findViewById(R.id.you_Click);
        button_shangdi= (Button)findViewById(R.id.shangdi_Click);
        button_qian.setOnClickListener(this);
        button_hou.setOnClickListener(this);
        button_zuo.setOnClickListener(this);
        button_you.setOnClickListener(this);
        button_shangdi.setOnClickListener(this);

        Video_Modul_Spinner = (Spinner)findViewById(R.id.Spinner_VIdeo_Model);
        Video_Modul_Spinner.setSelection(0,true);//进入不会自动播放
        Video_Modul_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String result=parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<5;i++){
                            Message message = new Message();
                            message.what = i;
                            handler.sendMessage(message);
                        }}
                }).start();}     break;

                    case 1:{
                        new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=5;i<10;i++){
                        Message message = new Message();
                        message.what = i;
                        handler.sendMessage(message);
                                            }}
                                                 }).start();}    break;

                    default:   break;

                  }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

//        button_full=(Button)findViewById(R.id.full_button);
//        button_full.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, front_View.class);
//                startActivity(intent);
//            }
//        });


//        resolutionTextView = new TextView(this);
//        resolutionTextView = (TextView) findViewById(R.id.resolution_textView);

//        simpleExoPlayerView1 = findViewById(R.id.player_view1);
//        simpleExoPlayerView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, front_View.class);
//                startActivity(intent);
//                                     }
//            });

/*        View VideoView1=(View)findViewById(R.id.player_view1);
          VideoView1.setOnClickListener(this);*/

//        simpleExoPlayerView2 = findViewById(R.id.player_view2);
//
//        simpleExoPlayerView0 =findViewById(R.id.player_view0);
//
//        simpleExoPlayerView3 = findViewById(R.id.player_view3);
//
//        simpleExoPlayerView4 =findViewById(R.id.player_view4);

        //自己加的


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.qian_Click:
                //自己加的
            {PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri1.toString());

//                play_video(mp4VideoUri1, simpleExoPlayerView1, player1);
//                play_video(mp4VideoUri2, simpleExoPlayerView2, player2);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<5;i++){
                        Message message = new Message();
                        message.what = i;
                        handler.sendMessage(message);
                    }}
                }).start();}         break;

        case R.id.hou_Click:
        //自己加的
        {
            simpleExoPlayerView0.release(true);
            PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri2.toString());
          new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    Message message = new Message();
                    message.what = i;
                    handler.sendMessage(message);
                }}
          }).start();}
          break;

            case R.id.zuo_Click:
                //自己加的
            {PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri3.toString());
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<5;i++){
                            Message message = new Message();
                            message.what = i;
                            handler.sendMessage(message);
                        }}
                }).start();}
            break;

            case R.id.you_Click:
                //自己加的
            {PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri4.toString());
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<5;i++){
                            Message message = new Message();
                            message.what = i;
                            handler.sendMessage(message);
                        }}
                }).start();}
            break;

            case R.id.shangdi_Click:
                //自己加的
            {PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri0.toString());
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<5;i++){
                            Message message = new Message();
                            message.what = i;
                            handler.sendMessage(message);
                        }}
                }).start();}
            break;
    }
    }

    //内存泄漏的问题;可能要用弱引用去解决
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

//            switch (msg.what) {
//                case UPDATE_1st_Video:
//                    PlayVideo.playVideo(simpleExoPlayerView0,mp4VideoUri0.toString());
//                    break;
//                case UPDATE_Zero_Video:
//                    PlayVideo.playVideo(simpleExoPlayerView1,mp4VideoUri1.toString());
//                    break;
//                case UPDATE_2nd_Video:
//                    PlayVideo.playVideo(simpleExoPlayerView2,mp4VideoUri2.toString());
//                    break;
//                case UPDATE_3rd_Video:
//                    PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                case UPDATE_4th_Video:
//                    PlayVideo.playVideo(simpleExoPlayerView4,mp4VideoUri4.toString());
//                    break;
//                case 5:
//                    UPDATE_3rd_Video:PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                case 6:
//                    PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                case 7:
//                    PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                case 8:
//                    PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                case 9:
//                    PlayVideo.playVideo(simpleExoPlayerView3,mp4VideoUri3.toString());
//                    break;
//                default:
//                    break;
//            }
        }
    };









//-------------------------------------------------------ANDROID LIFECYCLE---------------------------------------------------------------------------------------------

    @Override
    protected void onStop() {
        super.onStop();
        if (Util.SDK_INT > 23) {
            onHidden();
        Log.v(TAG, "onStop()...");
    }}

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart()...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume()...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (Util.SDK_INT <= 23) {
            onHidden();
        }

        Log.v(TAG, "onPause()...");
    }

    private void onHidden() {

        Log.d(TAG, "onClick: Release ALL");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy()...");
/*        player1.release();
        player2.release();
        player3.release();
        player4.release();
        player0.release();*/
    }


}
