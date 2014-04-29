package com.OlsonHowden.nextlevelapp;

import com.OlsonHowden.nextlevelapp.util.SystemUiHider;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.Intent;



public class MainScreenActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	private static final boolean AUTO_HIDE = true;
	
	private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
	
	private static final boolean TOGGLE_ON_CLICK = true;
	
	private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main_screen_activity);
        
        
        //final View controlsView = findViewById(R.id.fullscreen_content_controls);
        //final View contentView = findViewById(R.id.fullscreen_content);

        Button registerButton = (Button)findViewById(R.id.button_Register);
        Button loginButton = (Button)findViewById(R.id.button_Login);
        registerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent intentToRegister = new Intent(getApplicationContext(), NewUserRegistration.class);

		            startActivity(intentToRegister);
			}
		});
        loginButton.setOnClickListener(new View.OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intentToLogin = new Intent(getApplicationContext(), LoginHandle.class);
                String msg = "Log In to Next Level Gym";
                    
                startActivity(intentToLogin);              
            }
        });
}}
