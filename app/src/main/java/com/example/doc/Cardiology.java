package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Cardiology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiology);

        final RelativeLayout cardiodr1 = findViewById(R.id.cardiodr1);
        cardiodr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr1();
            }
        });

        final RelativeLayout cardiodr2 = findViewById(R.id.cardiodr2);
        cardiodr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr2();
            }
        });

        final RelativeLayout cardiodr3 = findViewById(R.id.cardiodr3);
        cardiodr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr3();
            }
        });

        final RelativeLayout cardiodr4 = findViewById(R.id.cardiodr4);
        cardiodr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr4();
            }
        });

        final RelativeLayout cardiodr5 = findViewById(R.id.cardiodr5);
        cardiodr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr5();
            }
        });

        final RelativeLayout cardiodr6 = findViewById(R.id.cardiodr6);
        cardiodr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr6();
            }
        });
    }

    private void cardiodr6() {
        Intent intent = new Intent(this, cardio6.class);
        startActivity(intent);
    }

    private void cardiodr5() {
        Intent intent = new Intent(this, cardio5.class);
        startActivity(intent);
    }

    private void cardiodr4() {
        Intent intent = new Intent(this, cardio4.class);
        startActivity(intent);
    }

    private void cardiodr3() {
        Intent intent = new Intent(this, cardio3.class);
        startActivity(intent);
    }

    private void cardiodr1() {
        Intent intent = new Intent(this, cardio1.class);
        startActivity(intent);
    }

    private void cardiodr2() {
        Intent intent = new Intent(this, cardio2.class);
        startActivity(intent);
    }
}