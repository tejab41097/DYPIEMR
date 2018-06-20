package com.miniproject.dypiemr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button b1;
        b1=(Button)findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent map=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/dir//Dr.+DY+Patil+Institute+of+Engineering,+Management+and+Research,+D.+Y.+Patil+Educational+Complex,+Pradhikaran,+Akurdi,+Sector+29,+Nigdi,+Pimpri-Chinchwad,+Maharashtra+411044/@18.6463655,73.7250868,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3bc2b9ef588fffff:0xed7869959e7d6300!2m2!1d73.7601065!2d18.6463687"));
                startActivity(map);
            }
        });
    }
}
