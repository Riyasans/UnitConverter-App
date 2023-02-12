package com.example.uintcoverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView power = (CardView) findViewById(R.id.power);
        CardView weight = (CardView) findViewById(R.id.weight);
        CardView length = (CardView) findViewById(R.id.length);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView freq = (CardView) findViewById(R.id.frequency);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView speed = (CardView) findViewById(R.id.speed);
        CardView temp = (CardView) findViewById(R.id.temp);

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PowerActivity.class);
                startActivity(intent);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WeightActivity.class);
                startActivity(intent);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LengthActivity.class);
                startActivity(intent);
            }
        });
       freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrequecyActivity.class);
                startActivity(intent);
            }
        });
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpeedActivity.class);
                startActivity(intent);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempActivity.class);
                startActivity(intent);
            }
        });

    }
}