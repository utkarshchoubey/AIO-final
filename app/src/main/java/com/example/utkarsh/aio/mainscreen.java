package com.example.utkarsh.aio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class mainscreen extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    GridLayout mainGrid;

    //view objects
    private TextView textViewUserEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
        firebaseAuth = FirebaseAuth.getInstance();

        //if the user is not logged in
        //that means current user will return null
        if(firebaseAuth.getCurrentUser() == null){
            //closing this activity
            finish();
            //starting login activity
            startActivity(new Intent(this, Main2Activity.class));
        }

        //getting current user
        FirebaseUser user = firebaseAuth.getCurrentUser();

        //initializing views
        textViewUserEmail = (TextView) findViewById(R.id.textViewUserEmail);

        //displaying logged in user name
        textViewUserEmail.setText(user.getEmail());

        //adding listener to button




        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {

        for(int i=0;i<mainGrid.getChildCount();i++){
            final int finali=i;
            CardView cardView=(CardView)mainGrid.getChildAt(i);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finali==0){
                    Intent intent=new Intent(mainscreen.this,CanteenActivity.class);
                    startActivity(intent);
                    }
                    if(finali==1){
                        Intent intent=new Intent(mainscreen.this,lostfound.class);
                        startActivity(intent);
                    }
                    if(finali==3){
                        Intent intent=new Intent(mainscreen.this,events.class);
                        startActivity(intent);
                    }
                    if(finali==4){
                        Intent intent=new Intent(mainscreen.this,MainChatActivity.class);
                        startActivity(intent);
                    }
                    if(finali==2){
                        Intent intent=new Intent(mainscreen.this,MainChatActivity.class);
                        startActivity(intent);
                    }
                    if(finali==5){
                        firebaseAuth.signOut();
                        //closing activity
                        finish();
                        //starting login activity
                        startActivity(new Intent(mainscreen.this, Main2Activity.class));
                    }
                }
            });
        }
    }

}
