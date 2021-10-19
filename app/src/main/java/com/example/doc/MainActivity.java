package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView toolbar = findViewById(R.id.toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toolbar();
            }
        });

        final Button Doctorshome = findViewById(R.id.Doctorshome);
        Doctorshome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Doctorshome();
            }
        });

        final Button hospitalhome = findViewById(R.id.hospitalhome);
        hospitalhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hospitalhome();
            }
        });

    }

    private void hospitalhome() {
        Intent intent = new Intent(this, HospitalsHome.class);
        startActivity(intent);
    }

    private void Doctorshome() {
        Intent intent = new Intent(this, DoctorsHome.class);
        startActivity(intent);
    }

    private void toolbar() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }



}
