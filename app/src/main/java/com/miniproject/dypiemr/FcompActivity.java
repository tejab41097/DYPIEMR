package com.miniproject.dypiemr;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class FcompActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Cursor c = null;
    DatabaseHelper myDbHelper;
    String tname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcomp);
        tname=getIntent().getStringExtra("key");
        myDbHelper = new DatabaseHelper(FcompActivity.this);
        try

        {
            myDbHelper.createDataBase();
        } catch(
                IOException ioe)

        {
            throw new Error("Unable to create database");
        }
        try

        {
            myDbHelper.openDataBase();
        } catch(
                SQLException sqle)

        {
            throw sqle;
        }
        ListView l=(ListView)findViewById(R.id.lisi);
        c=myDbHelper.getnames(tname);
        c.moveToFirst();
        int i=1;
        do{
            c.moveToNext();
            i++;
        }while (!c.isLast());
        String[] names =new String[i];
        c=myDbHelper.getnames(tname);
        c.moveToFirst();
        i=0;
        names[i]=c.getString(0).toString();
        do{
                c.moveToNext();
                i++;
                names[i]=c.getString(0).toString();
            }while (!c.isLast());
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,R.layout.textlist,names);
        l.setAdapter(a);
        l.setOnItemClickListener(this);
    }
    public void click(View view,String send)
    {
        c = myDbHelper.getinfo(tname,send);
        if(c.moveToFirst()) {
            byte[] img= c.getBlob(5);
            Bitmap b= BitmapFactory.decodeByteArray(img,0,img.length);
            ImageView i=new ImageView(this);
            i.setImageBitmap(b);
            new AlertDialog.Builder(this)
                    .setTitle("Description Of Faculty:- \n"+send).setView(i)
                    .setMessage("Name:-" + c.getString(1) + "\n" + "Experience:- " + c.getString(2) + "Years\n"+
                    "Qualification:-"+c.getString(3)+"\nPublications:-"+c.getString(4)+"\n")
                    .setNegativeButton("Back",null).create().show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView t=(TextView)view;
        String send=t.getText().toString();
        click(view,send);
    }
}
