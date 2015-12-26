package com.devilcity.messdl;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignupActivity extends AppCompatActivity {

    protected EditText mName, mEmail, mMobileNumber,mPassword;
    protected Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mName = (EditText) findViewById(R.id.Name);
        mEmail = (EditText) findViewById(R.id.Email);
        mMobileNumber = (EditText) findViewById(R.id.MobileNumber);
        mPassword = (EditText) findViewById(R.id.Password);
        mSignUpButton = (Button) findViewById(R.id.SignUpButton);

        //Listen to Button Click.
        mSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Initialize
                 String username = mName.getText().toString().trim();
                 String email = mEmail.getText().toString().trim();
                 String password = mPassword.getText().toString().trim();
                 String mobileNumber = mMobileNumber.getText().toString().trim();

                //Sending data to Parse.
                ParseUser newUsersInfo = new ParseUser();
                newUsersInfo.setUsername(mobileNumber);
                newUsersInfo.setEmail(email);
                newUsersInfo.put("Name",username);
                newUsersInfo.setPassword(password);
                newUsersInfo.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            //Sign up successful.
                            Toast.makeText(SignupActivity.this,"Success",Toast.LENGTH_SHORT).show();
                            //Intent loginPage = new Intent(SignupActivity.this,LoginActivity.class);
                            //startActivity(loginPage);

                        } else {
                            //Error Signing up.
                            AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
                            builder.setMessage(e.getMessage());
                            builder.setTitle("Sorry!");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //close the Dialog.
                                    dialog.dismiss();
                                }
                            });
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
            }
        });

    }
}
