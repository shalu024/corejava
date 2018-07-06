package com.example.shalu.registraion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button b;
     Button b1;
     EditText name,pass,email,phone;

     SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b  =findViewById(R.id.btn1);
        b1 =(Button)findViewById(R.id.btn2);
        name =(EditText)findViewById(R.id.ed1);
        pass =(EditText)findViewById(R.id.ed2);
        email =(EditText)findViewById(R.id.ed3);
        phone =(EditText)findViewById(R.id.ed4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = getSharedPreferences("userinfo", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name", name.getText().toString());
                editor.putString("password", pass.getText().toString());
                editor.putString("email", email.getText().toString());
                editor.putString("phone", phone.getText().toString());
                editor.commit();
                Toast.makeText(MainActivity.this, "You are register information successfully", Toast.LENGTH_SHORT).show();
            //    Intent i= new Intent(MainActivity.this,Activity2.class);
             //   startActivity(i);
            }
            } ) ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
            }
        });

        }
    }






