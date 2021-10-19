package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Psychiaerist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychiaerist);
        final RelativeLayout phydr1 = findViewById(R.id.phydr1);
        phydr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr1();
            }
        });

        final RelativeLayout phydr2 = findViewById(R.id.phydr2);
        phydr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr2();
            }
        });

        final RelativeLayout phydr3 = findViewById(R.id.phydr3);
        phydr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr3();
            }
        });

        final RelativeLayout phydr4 = findViewById(R.id.phydr4);
        phydr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr4();
            }
        });

        final RelativeLayout phydr5 = findViewById(R.id.phydr5);
        phydr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr5();
            }
        });

        final RelativeLayout phydr6 = findViewById(R.id.phydr6);
        phydr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phydr6();
            }
        });



    }

    private void phydr6() {
        Intent intent = new Intent(this, phy6.class);
        startActivity(intent);
    }

    private void phydr5() {
        Intent intent = new Intent(this, phy5.class);
        startActivity(intent);
    }

    private void phydr4() {
        Intent intent = new Intent(this, phy4.class);
        startActivity(intent);
    }

    private void phydr3() {
        Intent intent = new Intent(this, phy3.class);
        startActivity(intent);
    }

    private void phydr1() {
        Intent intent = new Intent(this, phy1.class);
        startActivity(intent);
    }

    private void phydr2() {
        Intent intent = new Intent(this, phy2.class);
        startActivity(intent);
    }

}