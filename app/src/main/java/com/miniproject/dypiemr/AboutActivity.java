package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent iinsti=new Intent(AboutActivity.this,InstiActivity.class);
                startActivity(iinsti);

            }
        });
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent ivision=new Intent(AboutActivity.this,VisionActivity.class);
                startActivity(ivision);
            }
        });
        b3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent imsg=new Intent(AboutActivity.this,MessageActivity.class);
                startActivity(imsg);
            }
        });
        b4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent igovern=new Intent(AboutActivity.this,GovernActivity.class);
                startActivity(igovern);
            }
        });


    }
    public void video(View view)
    {
        Intent imain= new Intent(AboutActivity.this,VirtualActivity.class);
        startActivity(imain);
    }
    public void calender(View view)
    {
        Intent ical= new Intent(AboutActivity.this,CalCourseActivity.class);
        startActivity(ical);
    }

}
