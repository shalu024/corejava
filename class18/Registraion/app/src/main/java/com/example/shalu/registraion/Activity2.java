package com.example.shalu.registraion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText edt1,edt2;
    Button bt;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        edt1=(EditText)findViewById(R.id.edit1);
        edt2=(EditText)findViewById(R.id.editText);
        bt=(Button)findViewById(R.id.button);

        sp=getSharedPreferences("userinfo",MODE_PRIVATE);

        final Intent i=new Intent(Activity2.this,Activity3.class);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String str1=edt1.getText().toString();
                final String str2=edt2.getText().toString();

                final String user=sp.getString("name","");
                final String pass=sp.getString("password","");


                if (str1.equals(user) && str2.equals(pass))
                {
                    Toast.makeText(getApplicationContext(),"you are login successfully",Toast.LENGTH_LONG).show();
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"you are login successfully",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
