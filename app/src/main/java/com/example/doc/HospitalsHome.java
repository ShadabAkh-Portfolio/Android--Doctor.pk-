package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;

public class HospitalsHome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_home);
        final RelativeLayout hos1 = findViewById(R.id.hos1);
        hos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hos1();
            }
        });

        final RelativeLayout hos2 = findViewById(R.id.hos2);
        hos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hos2();
            }
        });

        final RelativeLayout hos3 = findViewById(R.id.hos3);
        hos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hos3();
            }
        });

        final RelativeLayout hos4 = findViewById(R.id.hos4);
        hos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hos4();
            }
        });

        final RelativeLayout hos5 = findViewById(R.id.hos5);
        hos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hos5();
            }
        });
    }

    private void hos1() {
        Intent intent = new Intent(this, hosp1.class);
        startActivity(intent);
    }
    private void hos2() {
        Intent intent = new Intent(this, hosp2.class);
        startActivity(intent);
    }
    private void hos3() {
        Intent intent = new Intent(this, hosp3.class);
        startActivity(intent);
    }
    private void hos4() {
        Intent intent = new Intent(this, hosp4.class);
        startActivity(intent);
    }
    private void hos5() {
        Intent intent = new Intent(this, hosp5.class);
        startActivity(intent);
    }
}