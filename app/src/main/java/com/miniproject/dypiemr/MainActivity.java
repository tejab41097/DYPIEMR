package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.about);
        Button b2=(Button)findViewById(R.id.faculty);
        Button b3=(Button)findViewById(R.id.course);
        Button b4=(Button)findViewById(R.id.tp);
        Button b5=(Button)findViewById(R.id.fee);
        Button b6=(Button)findViewById(R.id.map);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent iabout =new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(iabout);
                    }
                }
        );
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent ifaculty =new Intent(MainActivity.this,FacultyActivity.class);
                        startActivity(ifaculty);
                    }
                }
        );
        b3.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent icourse =new Intent(MainActivity.this,CourseActivity.class);
                        startActivity(icourse);
                    }
                }
        );
        b4.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent itp =new Intent(MainActivity.this,TpActivity.class);
                        startActivity(itp);
                    }
                }
        );
        b5.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent ifee =new Intent(MainActivity.this,DocFeeActivity.class);
                        startActivity(ifee);
                    }
                }
        );
        b6.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent imap =new Intent(MainActivity.this,MapActivity.class);
                        startActivity(imap);
                    }
                }
        );


    }
    public void click(View view)
    {
        Intent ifeed =new Intent(MainActivity.this,FeedbackActivity.class);
        startActivity(ifeed);
    }
}

