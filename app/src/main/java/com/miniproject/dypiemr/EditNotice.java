package com.miniproject.dypiemr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class EditNotice extends AppCompatActivity {

    Button upload,logout;
    ImageButton image;
    TextView mChildValueEditText;

    private static final int GALLERY_REQUEST = 1;
    Uri imageuri=null;

    DatabaseReference mRef;
    StorageReference mstore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_notice);

        upload=(Button)findViewById(R.id.button14);
        logout=(Button)findViewById(R.id.button18);
        mChildValueEditText=(TextView)findViewById(R.id.editText2);
        image=(ImageButton)findViewById(R.id.imageButton);


        mstore= FirebaseStorage.getInstance().getReference();
        mRef=FirebaseDatabase.getInstance().getReference().child("NOTICE");

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_GET_CONTENT);
                gallery.setType("image/*");
                startActivityForResult(gallery,GALLERY_REQUEST);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startposting();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mback=new Intent(EditNotice.this,HOME.class);startActivity(mback);

            }
        });

    }

    private void startposting() {

        final String childValue = mChildValueEditText.getText().toString();

        if(!TextUtils.isEmpty(childValue) && imageuri!=null){

            StorageReference filepath=mstore.child("NOTICE_IMAGES").child(imageuri.getLastPathSegment());

            filepath.putFile(imageuri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                    Uri downloadUrl=taskSnapshot.getDownloadUrl();

                    DatabaseReference newnotice=mRef.push();

                    newnotice.child("DESCRIPTION").setValue(childValue);
                    newnotice.child("IMAGE").setValue(downloadUrl.toString());

                    Toast toast=Toast.makeText(EditNotice.this, "NOTICE UPLOADED SUCCESSFULLY...!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
                    toast.show();

                }
            });

        }
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==GALLERY_REQUEST && resultCode==RESULT_OK){

            imageuri=data.getData();
            image.setImageURI(imageuri);
        }
    }

}
