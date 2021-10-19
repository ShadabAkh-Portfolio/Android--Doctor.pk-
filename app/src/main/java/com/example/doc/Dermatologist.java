package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Dermatologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dermatologist);

        final RelativeLayout dermadr1 = findViewById(R.id.dermadr1);
        dermadr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr1();
            }
        });

        final RelativeLayout dermadr2 = findViewById(R.id.dermadr2);
        dermadr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr2();
            }
        });

        final RelativeLayout dermadr3 = findViewById(R.id.dermadr3);
        dermadr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr3();
            }
        });

        final RelativeLayout dermadr4 = findViewById(R.id.dermadr4);
        dermadr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr4();
            }
        });

        final RelativeLayout dermadr5 = findViewById(R.id.dermadr5);
        dermadr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr5();
            }
        });

        final RelativeLayout dermadr6 = findViewById(R.id.dermadr6);
        dermadr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermadr6();
            }
        });


    }

    private void dermadr6() {
        Intent intent = new Intent(this, derma6.class);
        startActivity(intent);
    }

    private void dermadr5() {
        Intent intent = new Intent(this, derma5.class);
        startActivity(intent);
    }

    private void dermadr4() {
        Intent intent = new Intent(this, derma4.class);
        startActivity(intent);
    }

    private void dermadr3() {
        Intent intent = new Intent(this, derma3.class);
        startActivity(intent);
    }

    private void dermadr1() {
        Intent intent = new Intent(this, derma1.class);
        startActivity(intent);
    }

    private void dermadr2() {
        Intent intent = new Intent(this, derma2.class);
        startActivity(intent);
    }

}