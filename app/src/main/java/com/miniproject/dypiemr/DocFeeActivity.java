package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DocFeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_fee);
    }
    public void doc(View view)
    {
        Intent idoc= new Intent(DocFeeActivity.this,DocActivity.class);
        startActivity(idoc);
    }
    public void fee(View view)
    {
        Intent ifee= new Intent(DocFeeActivity.this,FeeActivity.class);
        startActivity(ifee);
    }

}
