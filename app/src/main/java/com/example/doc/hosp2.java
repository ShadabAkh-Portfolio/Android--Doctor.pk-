package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class hosp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosp2);
        final RelativeLayout cardiodr1 = findViewById(R.id.cardiodr1);
        cardiodr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr1();
            }
        });


    }

    private void cardiodr1() {
        Intent intent = new Intent(this, cardio1.class);
        startActivity(intent);
    }

}