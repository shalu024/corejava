package com.example.shalu.registraion;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView reg1,reg2,reg3;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        reg1 = (TextView) findViewById(R.id.textView3);
        reg2= (TextView) findViewById(R.id.Text);
        reg3=(TextView)findViewById(R.id.tex1);

        sp=getSharedPreferences("userinfo",MODE_PRIVATE);
        reg1.setText(sp.getString("name",""));
        reg2.setText(sp.getString("email",""));
        reg3.setText(sp.getString("phone",""));


    }
}
