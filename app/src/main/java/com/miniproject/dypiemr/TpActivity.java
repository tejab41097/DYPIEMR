package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
    }
    public void msg(View v){
        Intent imsg=new Intent(TpActivity.this,TpomsgActivity.class);
        startActivity(imsg);
    }
    public void overview(View v){
        Intent iview=new Intent(TpActivity.this,TpoviewActivity.class);
        startActivity(iview);
    }
    public void represent(View v){
        Intent irepres=new Intent(TpActivity.this,TporepresActivity.class);
        startActivity(irepres);
    }
    public void recruit(View v){
        Intent ire=new Intent(TpActivity.this,RecruitActivity.class);
        startActivity(ire);
    }

}
