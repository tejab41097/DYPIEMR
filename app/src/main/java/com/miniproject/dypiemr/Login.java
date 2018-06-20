package com.miniproject.dypiemr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText userid,pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


        userid= (EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText3);
        login=(Button)findViewById(R.id.button11);

        final String username="faculty";
        final String password="dypiemr@1";
        final String username1="student";
        final String password1="123456";


        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=userid.getText().toString();
                String pas=pass.getText().toString();
                Intent logged=new Intent(Login.this,Noticeboard.class);
                Intent logged1=new Intent(Login.this,EditNotice.class);

                if (user.equals(username)&& pas.equals(password)  )
                {
                    startActivity(logged1);
                }
                else if(user.equals(username1)&& pas.equals(password1))
                {
                    startActivity(logged);
                }
                else
                {
                    Toast.makeText(Login.this,"INVALID",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
