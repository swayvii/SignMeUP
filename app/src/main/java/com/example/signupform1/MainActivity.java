package com.example.signupform1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    Button signUp;
    EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = (Button)findViewById(R.id.button);
        et1 = (EditText)findViewById(R.id.etName);
        et2 = (EditText)findViewById(R.id.etEmail);
        et3 = (EditText)findViewById(R.id.etPassword);
        et4 = (EditText)findViewById(R.id.etReEnter);



        signUp.setOnClickListener(new OnClickListener(){
           @Override
            public void onClick(View v) {
               String name = String.valueOf(et1.getText()),
                       email = String.valueOf(et2.getText()),
                       password = String.valueOf(et3.getText()),
                       reenter = String.valueOf(et4.getText());


               if (name.equals("") || email.equals("") || password.equals("") || reenter.equals("") ) {

                   Toast.makeText(getApplicationContext(),
                           "Must enter all fields", Toast.LENGTH_SHORT).show();
               }
               else{

                   if (password.equals(reenter)) {

                           Toast.makeText(getApplicationContext(),
                                   "Welcome, " + name + ",to the SignUpFormApp",
                                   Toast.LENGTH_SHORT).show();

                   } else {
                           Toast.makeText(getApplicationContext(),
                                   "passwords don't match",
                                   Toast.LENGTH_SHORT).show();
                       }

                   }
               }
        });
        }
        }

