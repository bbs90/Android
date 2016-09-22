package com.example.light.lesson1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/*
    public void onSubmit(View view){
        EditText name = (EditText) findViewById(R.id.usrName);
        EditText passwrd = (EditText) findViewById(R.id.passWord);

        String nameStr = name.getText().toString();
        String passwrdStr = passwrd.getText().toString();

        if(passwrdStr.length() <= 7)
        {
            Context context = getApplicationContext();
            CharSequence text = "Password is too short";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else {

            Context context = getApplicationContext();
            CharSequence text = "Welcome " + nameStr + "!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }


    }
*/
    public void onClickSignUp(View view){
        EditText passwrd = (EditText) findViewById(R.id.passWord);
        String passwrdStr = passwrd.getText().toString();

        if(passwrdStr.length() <= 7)
        {
            Context context = getApplicationContext();
            CharSequence text = "Password is too short";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else {

            Intent nextPage = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(nextPage);
        }
    }

    public void onClickSignIn(View view){

        EditText name = (EditText) findViewById(R.id.usrName);
        EditText passwrd = (EditText) findViewById(R.id.passWord);

        String nameStr = name.getText().toString();


        String passwrdStr = passwrd.getText().toString();

        if(passwrdStr.length() <= 7)
        {
            Context context = getApplicationContext();
            CharSequence text = "Password is too short";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else {

            Context context = getApplicationContext();
            CharSequence text = "Welcome " + nameStr + "!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
