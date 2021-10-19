package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Gynaecologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gynaecologist);
        final RelativeLayout gynodr1 = findViewById(R.id.gynodr1);
        gynodr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr1();
            }
        });

        final RelativeLayout gynodr2 = findViewById(R.id.gynodr2);
        gynodr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr2();
            }
        });

        final RelativeLayout gynodr3 = findViewById(R.id.gynodr3);
        gynodr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr3();
            }
        });

        final RelativeLayout gynodr4 = findViewById(R.id.gynodr4);
        gynodr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr4();
            }
        });

        final RelativeLayout gynodr5 = findViewById(R.id.gynodr5);
        gynodr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr5();
            }
        });

        final RelativeLayout gynodr6 = findViewById(R.id.gynodr6);
        gynodr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynodr6();
            }
        });





    }

    private void gynodr6() {
        Intent intent = new Intent(this, gyno6.class);
        startActivity(intent);
    }

    private void gynodr5() {
        Intent intent = new Intent(this, gyno5.class);
        startActivity(intent);
    }

    private void gynodr4() {
        Intent intent = new Intent(this, gyno4.class);
        startActivity(intent);
    }

    private void gynodr3() {
        Intent intent = new Intent(this, gyno3.class);
        startActivity(intent);
    }

    private void gynodr1() {
        Intent intent = new Intent(this, gyno1.class);
        startActivity(intent);
    }

    private void gynodr2() {
        Intent intent = new Intent(this, gyno2.class);
        startActivity(intent);
    }

}