package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HOME extends AppCompatActivity {

    Button ts,guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ts=(Button)findViewById(R.id.button16);
        guest=(Button)findViewById(R.id.button15);

        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent announcement=new Intent(HOME.this,Login.class);
                startActivity(announcement);
            }
        });

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start=new Intent(HOME.this,MainActivity.class);
                startActivity(start);
            }
        });

    }

}
