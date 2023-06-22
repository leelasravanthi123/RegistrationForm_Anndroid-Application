# RegistrationForm_Anndroid-Application
  package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2;
    TextView t1,t2;
    RadioButton r1,r2;
    RatingBar rb;
    Button b;
    CheckBox c1,c2,c3;
    String gen="",lang="",rate,st1,st2,st3,st4,st5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editTextText);
        e2 = (EditText) findViewById(R.id.editTextText2);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        rb = (RatingBar) findViewById(R.id.ratingBar);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Name",e1.getText().toString());
                i.putExtra("email",e2.getText().toString());
                i.putExtra("gender",gen);
                i.putExtra("Language",lang);
                i.putExtra("rate",rate);
                startActivity(i);
            }
        });

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    r2.setChecked(false);
                    st1=r1.getText().toString();
                    gen=st1;
                }
                else
                {
                    gen=gen.replace(st1,"");
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    r1.setChecked(false);
                    st2=r2.getText().toString();
                    gen=st2;
                }
                else
                {
                    gen=gen.replace(st2,"");
                }
            }
        });
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    st3=c1.getText().toString();
                    lang=lang.concat(st3);
                }
                else
                {
                    lang=lang.replace(st3,"");
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    st4=c2.getText().toString();
                    lang=lang.concat(st4);
                }
                else
                {
                    lang=lang.replace(st4,"");
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    st5=c3.getText().toString();
                    lang=lang.concat(st5);
                }
                else
                {
                    lang=lang.replace(st5,"");
                }
            }
        });
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rate=Float.toString(v);
            }
        });
    }
}
