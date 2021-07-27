package com.example.movie3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickButton1 (View v){
        Toast.makeText(getApplicationContext(), "좋아요", Toast.LENGTH_LONG).show();
    }

    public void onClickButton2 (View v){
        Toast.makeText(getApplicationContext(),"싫어요", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}