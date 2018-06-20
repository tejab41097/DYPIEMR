package com.miniproject.dypiemr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void click(View view)
    {
        EditText name=(EditText)findViewById(R.id.name);
        EditText id=(EditText)findViewById(R.id.id);
        EditText sub=(EditText)findViewById(R.id.sub);
        EditText msg=(EditText)findViewById(R.id.msg);

        if(name.getText().toString().equals(""))
            name.setError("Mandatory Field");
        else if(id.getText().toString().equals(""))
            id.setError("Mandatory Field");
        else if(sub.getText().toString().equals(""))
            sub.setError("Mandatory Field");
        else if(msg.getText().toString().equals(""))
            msg.setError("Mandatory Field");
        else
        {
            Intent i=new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL,new String[]{"dypiemr1@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT,"Dear Developers, \n"+msg.getText().toString()+"\n regards,"+id.getText().toString());

            try
            {
                Toast.makeText(this, "You Are getting Directed to mailing app !!!" +
                        "\nPlease Wait!!", Toast.LENGTH_LONG).show();
                startActivity(Intent.createChooser(i,"send mail"));
            }catch(android.content.ActivityNotFoundException e)
            {
                Toast.makeText(this, "No Mail Application Found!!", Toast.LENGTH_SHORT).show();
            }
            catch (Exception e)
            {
                Toast.makeText(this,"Unexpected Error "+e,Toast.LENGTH_SHORT).show();
            }
        }
    }
}
