package com.example.shalu.intent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        {
            t = (TextView) findViewById(R.id.tex);


            Bundle b = getIntent().getExtras();

            String user = b.getString("User");
            String pass = b.getString("Password");

            if (user.equals("shanu") && pass.equals("12345"))
                t.setText("username" + user + "\n\n WELCOME  \n\nYou logged in Successful)");

            else
                t.setText("Wrong user name or password");

        }

    }

}
