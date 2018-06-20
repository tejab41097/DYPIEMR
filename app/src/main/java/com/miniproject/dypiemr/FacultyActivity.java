package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        final Button b1=(Button)findViewById(R.id.button6);
        final Button b2=(Button)findViewById(R.id.button7);
        final Button b3=(Button)findViewById(R.id.button8);
        final Button b4=(Button)findViewById(R.id.button9);
        final Button b5=(Button)findViewById(R.id.button10);
        b1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ch=b1.getText().toString();
                click(ch);
            }
        });
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ch=b2.getText().toString();
                click(ch);
            }
        });
        b3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ch=b3.getText().toString();
                click(ch);
            }
        });
        b4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ch=b4.getText().toString();
                click(ch);
            }
        });
        b5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ch=b5.getText().toString();
                click(ch);
            }
        });
    }

public void click(String ch) {
    Intent i = new Intent(this, FcompActivity.class);
    i.putExtra("key",ch);
    startActivity(i);
}
}
