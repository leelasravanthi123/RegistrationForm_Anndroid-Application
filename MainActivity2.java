# RegistrationForm_Anndroid-Application
package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView) findViewById(R.id.textView3);
        t2 = (TextView) findViewById(R.id.textView4);
        t3 = (TextView) findViewById(R.id.textView5);
        t4 = (TextView) findViewById(R.id.textView6);
        t5 = (TextView) findViewById(R.id.textView7);
        Intent i = getIntent();
        String nm = i.getStringExtra("Name");
        t1.setText("Name :" +nm);
        String em = i.getStringExtra("email");
        t2.setText("Email :" +em);
        String gn = i.getStringExtra("gender");
        t3.setText("Gender :" +gn);
        String ln = i.getStringExtra("Language");
        t4.setText("Language :" +ln);
        String rt = i.getStringExtra("rate");
        t5.setText("Rate :" +rt);
    }
}
