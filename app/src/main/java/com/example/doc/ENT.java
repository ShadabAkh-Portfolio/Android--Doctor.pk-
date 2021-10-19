package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class ENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_n_t);
        final RelativeLayout entdr1 = findViewById(R.id.entdr1);
        entdr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr1();
            }
        });

        final RelativeLayout entdr2 = findViewById(R.id.entdr2);
        entdr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr2();
            }
        });

        final RelativeLayout entdr3 = findViewById(R.id.entdr3);
        entdr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr3();
            }
        });

        final RelativeLayout entdr4 = findViewById(R.id.entdr4);
        entdr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr4();
            }
        });

        final RelativeLayout entdr5 = findViewById(R.id.entdr5);
        entdr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr5();
            }
        });

        final RelativeLayout entdr6 = findViewById(R.id.entdr6);
        entdr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entdr6();
            }
        });
    }

    private void entdr6() {
        Intent intent = new Intent(this, ent6.class);
        startActivity(intent);
    }

    private void entdr5() {
        Intent intent = new Intent(this, ent5.class);
        startActivity(intent);
    }

    private void entdr4() {
        Intent intent = new Intent(this, ent4.class);
        startActivity(intent);
    }

    private void entdr3() {
        Intent intent = new Intent(this, ent3.class);
        startActivity(intent);
    }

    private void entdr1() {
        Intent intent = new Intent(this, ent1.class);
        startActivity(intent);
    }

    private void entdr2() {
        Intent intent = new Intent(this, ent2.class);
        startActivity(intent);
    }

}