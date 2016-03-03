package com.devilcity.messdl;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;
import com.parse.ParseObject;

public class FirstPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.log_in_button:
                Intent logIn = new Intent(this,LoginActivity.class);
                startActivity(logIn);
                break;

            case R.id.sign_up_button:
                Intent signUp = new Intent(this,SignupActivity.class);
                startActivity(signUp);
                break;

            case R.id.skip_button:
                Intent skip = new Intent(this,MainActivity.class);
                startActivity(skip);
                break;
        }
    }
}
