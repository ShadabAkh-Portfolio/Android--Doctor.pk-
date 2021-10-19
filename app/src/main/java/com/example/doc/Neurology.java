package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Neurology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurology);
        final RelativeLayout neurodr1 = findViewById(R.id.neurodr1);
        neurodr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr1();
            }
        });

        final RelativeLayout neurodr2 = findViewById(R.id.neurodr2);
        neurodr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr2();
            }
        });

        final RelativeLayout neurodr3 = findViewById(R.id.neurodr3);
        neurodr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr3();
            }
        });

        final RelativeLayout neurodr4 = findViewById(R.id.neurodr4);
        neurodr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr4();
            }
        });

        final RelativeLayout neurodr5 = findViewById(R.id.neurodr5);
        neurodr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr5();
            }
        });

        final RelativeLayout neurodr6 = findViewById(R.id.neurodr6);
        neurodr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurodr6();
            }
        });



    }

    private void neurodr6() {
        Intent intent = new Intent(this, neuro6.class);
        startActivity(intent);
    }

    private void neurodr5() {
        Intent intent = new Intent(this, neuro5.class);
        startActivity(intent);
    }

    private void neurodr4() {
        Intent intent = new Intent(this, neuro4.class);
        startActivity(intent);
    }

    private void neurodr3() {
        Intent intent = new Intent(this, neuro3.class);
        startActivity(intent);
    }

    private void neurodr1() {
        Intent intent = new Intent(this, neuro1.class);
        startActivity(intent);
    }

    private void neurodr2() {
        Intent intent = new Intent(this, neuro2.class);
        startActivity(intent);
    }
    }