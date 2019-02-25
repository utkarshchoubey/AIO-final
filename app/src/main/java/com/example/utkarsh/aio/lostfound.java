package com.example.utkarsh.aio;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class lostfound extends AppCompatActivity {

    RecyclerView  mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostfound);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Lost n Found");
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true) ;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mFirebaseDatabase=FirebaseDatabase.getInstance();
        mRef=mFirebaseDatabase.getReference("Data");

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<ModalLost,ViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<ModalLost, ViewHolder>(ModalLost.class,R.layout.row,ViewHolder.class,mRef) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder, ModalLost model, int position) {
                        viewHolder.setDetails(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage());
                    }
                };
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);

    }
}
