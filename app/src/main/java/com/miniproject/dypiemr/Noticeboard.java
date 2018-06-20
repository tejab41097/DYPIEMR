package com.miniproject.dypiemr;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


public class Noticeboard extends AppCompatActivity {

    private RecyclerView noticelist;
    private DatabaseReference mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticeboard);

        mdata=FirebaseDatabase.getInstance().getReference().child("NOTICE");

        noticelist = (RecyclerView) findViewById(R.id.notice_list);
        noticelist.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Note,NoteViewHolder> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<Note, NoteViewHolder>(Note.class, R.layout.notice_row, NoteViewHolder.class, mdata) {
            @Override
            protected void populateViewHolder(NoteViewHolder viewHolder, Note model, int position) {

                viewHolder.setDesc(model.DESCRIPTION);
                viewHolder.setImage(getApplicationContext(),model.IMAGE);

            }
        };

        noticelist.setAdapter(firebaseRecyclerAdapter);

    }
    public static class NoteViewHolder extends RecyclerView.ViewHolder{

        View mview;

        public NoteViewHolder(View itemView) {
            super(itemView);

            mview=itemView;
        }
    public void setDesc(String DESCRIPTION){
        TextView notice_desc=(TextView)mview.findViewById(R.id.noticedesc);
        notice_desc.setText(DESCRIPTION);
       }

        public void setImage(Context ctx,String image) {
            ImageView notice_img=(ImageView)mview.findViewById(R.id.noticeimage);
            Picasso.with(ctx).load(image).into(notice_img);

        }
    }
}
