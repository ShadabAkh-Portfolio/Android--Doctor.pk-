package com.example.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow();
            }
        });

        final LinearLayout neurologist = findViewById(R.id.neurologist);
        neurologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                neurologist();
            }
        });

        final LinearLayout Dentist = findViewById(R.id.dentist);
        Dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dentist();
            }
        });

        final LinearLayout psychiaerist = findViewById(R.id.psychiaerist);
        psychiaerist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                psychiaerist();
            }
        });

        final LinearLayout gynaeecologist = findViewById(R.id.gynaeecologist);
        gynaeecologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gynaeecologist();
            }
        });

        final LinearLayout cardiology = findViewById(R.id.cardiology);
        cardiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardiology();
            }
        });

        final LinearLayout ent = findViewById(R.id.ent);
        ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ent();
            }
        });

        final LinearLayout urologist = findViewById(R.id.urologist);
        urologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urologist();
            }
        });

        final LinearLayout  dermatologist = findViewById(R.id.dermatologist);
        dermatologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dermatologist();
            }
        });

}

    private void dermatologist() {
        Intent intent = new Intent(this, Dermatologist.class);
        startActivity(intent);
    }

    private void urologist() {
        Intent intent = new Intent(this, Urology.class);
        startActivity(intent);
    }

    private void ent() {
        Intent intent = new Intent(this, ENT.class);
        startActivity(intent);
    }

    private void cardiology() {
        Intent intent = new Intent(this, Cardiology.class);
        startActivity(intent);
    }

    private void gynaeecologist() {
        Intent intent = new Intent(this, Gynaecologist.class);
        startActivity(intent);
    }

    private void psychiaerist() {
        Intent intent = new Intent(this, Psychiaerist.class);
        startActivity(intent);

    }

    private void Dentist() {
        Intent intent = new Intent(this, Dentist.class);
        startActivity(intent);
    }

    private void neurologist() {
        Intent intent = new Intent(this, Neurology.class);
        startActivity(intent);
    }

    private void arrow() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void dermadr6() {
        Intent intent = new Intent(this, derma6.class);
        startActivity(intent);
    }

    private void dermadr5() {
        Intent intent = new Intent(this, derma5.class);
        startActivity(intent);
    }

    private void dermadr4() {
        Intent intent = new Intent(this, derma4.class);
        startActivity(intent);
    }

    private void dermadr3() {
        Intent intent = new Intent(this, derma3.class);
        startActivity(intent);
    }

    private void dermadr1() {
        Intent intent = new Intent(this, derma1.class);
        startActivity(intent);
    }

    private void dermadr2() {
        Intent intent = new Intent(this, derma2.class);
        startActivity(intent);
    }
}