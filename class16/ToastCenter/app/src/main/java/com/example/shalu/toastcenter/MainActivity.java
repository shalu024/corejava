package com.example.shalu.toastcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "created", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "destroyed" , Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();

        }

    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "started", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();

    }
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "resumed", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "paused", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "stoped", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "restarted", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
}


