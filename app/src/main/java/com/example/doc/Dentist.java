package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Dentist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentist);
        final RelativeLayout dentistdr1 = findViewById(R.id.dentistdr1);
        dentistdr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr1();
            }
        });

        final RelativeLayout dentistdr2 = findViewById(R.id.dentistdr2);
        dentistdr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr2();
            }
        });

        final RelativeLayout dentistdr3 = findViewById(R.id.dentistdr3);
        dentistdr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr3();
            }
        });

        final RelativeLayout dentistdr4 = findViewById(R.id.dentistdr4);
        dentistdr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr4();
            }
        });

        final RelativeLayout dentistdr5 = findViewById(R.id.dentistdr5);
        dentistdr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr5();
            }
        });

        final RelativeLayout dentistdr6 = findViewById(R.id.dentistdr6);
        dentistdr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dentistdr6 ();
            }
        });



    }

    private void dentistdr6() {
        Intent intent = new Intent(this, denti6.class);
        startActivity(intent);
    }

    private void dentistdr5() {
        Intent intent = new Intent(this, denti5.class);
        startActivity(intent);
    }

    private void dentistdr4() {
        Intent intent = new Intent(this, denti4.class);
        startActivity(intent);
    }

    private void dentistdr3() {
        Intent intent = new Intent(this, denti3.class);
        startActivity(intent);
    }

    private void dentistdr1() {
        Intent intent = new Intent(this, denti1.class);
        startActivity(intent);
    }

    private void dentistdr2() {
        Intent intent = new Intent(this, denti2.class);
        startActivity(intent);
    }
}