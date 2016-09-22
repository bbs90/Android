package com.example.light.lesson1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /*
     * This method isEmailValid was taken from stackoverflow
     *
     */
    public boolean isEmailValid(String email)
    {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(regExpn,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public void onDone(View view){


        EditText firstName = (EditText) findViewById(R.id.fname);
        EditText lasttName = (EditText) findViewById(R.id.lname);
        EditText phonenum = (EditText) findViewById(R.id.pnumber);
        EditText email = (EditText) findViewById(R.id.email);

        RadioButton male = (RadioButton) findViewById(R.id.male);
        RadioButton female = (RadioButton) findViewById(R.id.female);
        RadioButton other = (RadioButton) findViewById(R.id.other);

        CheckBox checkB = (CheckBox) findViewById(R.id.box);

        String gender;

        if(male.isChecked()){
            gender = "Male";
        }
        else if(female.isChecked()){
            gender = "Female";
        }
        else{
            gender = "Other";
        }

        String fnameStr = firstName.getText().toString();
        String lnameStr = lasttName.getText().toString();
        String phonenumStr = phonenum.getText().toString();
        String emailStr = email.getText().toString();

        if(checkB.isChecked()){

            if(isEmailValid(emailStr)){

                //Context context = getApplicationContext();
                CharSequence text = "Welcome " + fnameStr +" " +lnameStr+"!";
                //int duration = Toast.LENGTH_SHORT;

                //Toast toast = Toast.makeText(context, text, duration);
                //toast.show();

                String transferStr = text.toString();
                Intent nextPage = new Intent(Main2Activity.this, Main3Activity.class);
                nextPage.putExtra("transfer",transferStr);
                startActivity(nextPage);

            }
            else{

                Context context = getApplicationContext();
                CharSequence text = "Please enter a valid email";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }

        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Please accept the aggrement";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }


    }
}
