package com.miniproject.dypiemr;

import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VirtualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Button play=(Button)findViewById(R.id.button);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView v=(VideoView)findViewById(R.id.videoView);
        String path="android.resource://com.miniproject.dypiemr/"+R.raw.v;
        Uri uri=Uri.parse(path);
        v.setVideoURI(uri);
        v.requestFocus();
        v.start();
    }
}
