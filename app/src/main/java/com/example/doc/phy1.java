package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class phy1 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy1);
        button = (Button) findViewById(R.id.location);
        button2 = (Button) findViewById(R.id.appointment);
        button3 = (Button) findViewById(R.id.location1);
        button4 = (Button) findViewById(R.id.appointment1);
        button5 = (Button) findViewById(R.id.location2);
        button6 = (Button) findViewById(R.id.appointment2);

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
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Location is Under Process", Toast.LENGTH_LONG).show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Appointment is Under Process", Toast.LENGTH_LONG).show();

            }

        });



    }

}