package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cardio5 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio5);
        button = (Button) findViewById(R.id.location);
        button2 = (Button) findViewById(R.id.appointment);
        button3 = (Button) findViewById(R.id.location1);
        button4 = (Button) findViewById(R.id.appointment1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Location is Under Process", Toast.LENGTH_LONG).show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Appointment is Under Process", Toast.LENGTH_LONG).show();

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Location is Under Process", Toast.LENGTH_LONG).show();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Appointment is Under Process", Toast.LENGTH_LONG).show();

            }

        });
    }
}