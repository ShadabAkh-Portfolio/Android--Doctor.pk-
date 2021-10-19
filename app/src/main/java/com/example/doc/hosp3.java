package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class hosp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosp3);
        final RelativeLayout cardiodr2 = findViewById(R.id.cardiodr2);
        cardiodr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiodr2();
            }
        });
    }
    private void cardiodr2() {
        Intent intent = new Intent(this, cardio2.class);
        startActivity(intent);
    }
}