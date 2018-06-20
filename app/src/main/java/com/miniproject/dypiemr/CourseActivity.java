package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Toast toast= Toast.makeText(CourseActivity.this,"To See Details Click On Branch Name",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();
    }
    public void entc(View view) {
        Intent ientc=new Intent(this,EntcActivity.class);
        startActivity(ientc);
    }
    public void comp(View view) {
        Intent icomp=new Intent(this,CompActivity.class);
        startActivity(icomp);
    }
    public void mech(View view) {
        Intent imech=new Intent(this,MechActivity.class);
        startActivity(imech);
    }
    public void civil(View view) {
        Intent icivil=new Intent(this,CivilActivity.class);
        startActivity(icivil);
    }
    public void chem(View view) {
        Intent ichem=new Intent(this,ChemActivity.class);
        startActivity(ichem);
    }
}
