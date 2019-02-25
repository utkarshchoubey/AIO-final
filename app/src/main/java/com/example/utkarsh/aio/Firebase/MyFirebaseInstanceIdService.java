package com.example.utkarsh.aio.Firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String REG_TOKEN = "REG_TOKEN";
    @Override
    public void onTokenRefresh() {
        try {


            String recentToken = FirebaseInstanceId.getInstance().getToken();

            Log.d(REG_TOKEN, recentToken);
        }catch (Exception e){}
    }
}