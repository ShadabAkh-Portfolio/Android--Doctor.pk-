package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Urology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urology);

        final RelativeLayout urodr1 = findViewById(R.id.urodr1);
        urodr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr1();
            }
        });

        final RelativeLayout urodr2 = findViewById(R.id.urodr2);
        urodr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr2();
            }
        });

        final RelativeLayout urodr3 = findViewById(R.id.urodr3);
        urodr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr3();
            }
        });

        final RelativeLayout urodr4 = findViewById(R.id.urodr4);
        urodr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr4();
            }
        });

        final RelativeLayout urodr5 = findViewById(R.id.urodr5);
        urodr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr5();
            }
        });

        final RelativeLayout urodr6 = findViewById(R.id.urodr6);
        urodr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urodr6();
            }
        });



    }

    private void urodr6() {
        Intent intent = new Intent(this, uro6.class);
        startActivity(intent);
    }

    private void urodr5() {
        Intent intent = new Intent(this, uro5.class);
        startActivity(intent);
    }

    private void urodr4() {
        Intent intent = new Intent(this, uro4.class);
        startActivity(intent);
    }

    private void urodr3() {
        Intent intent = new Intent(this, uro3.class);
        startActivity(intent);
    }

    private void urodr1() {
        Intent intent = new Intent(this, uro1.class);
        startActivity(intent);
    }

    private void urodr2() {
        Intent intent = new Intent(this, uro2.class);
        startActivity(intent);
    }

}