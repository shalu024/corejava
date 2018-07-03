package com.example.shalu.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Button bt;
   private EditText ed1,ed2;
   private TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button)findViewById(R.id.button2);
        ed1=(EditText)findViewById(R.id.dt1);
        ed2=(EditText)findViewById(R.id.dt2);
        tv1=(TextView)findViewById(R.id.edt1);
        tv2=(TextView)findViewById(R.id.edt2);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(MainActivity.this,Activity2.class);
                 i.putExtra("User",ed1.getText().toString());
                 i.putExtra("Password",ed2.getText().toString());

                startActivity(i);
            }
        });
    }
}
