package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnLinearLayout,btnTableLayout,btnConstraintLayout1,btnConstraintLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnTableLayout = findViewById(R.id.btnTableLayout);
        btnConstraintLayout1 = findViewById(R.id.btnConstraintLayout1);
        btnConstraintLayout2 = findViewById(R.id.btnConstraintLayout2);

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(intent);
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableLayout.class);
                startActivity(intent);
            }
        });

        btnConstraintLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConstraintLayout1.class);
                startActivity(intent);
            }
        });

        btnConstraintLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConstraintLayout2.class);
                startActivity(intent);
            }
        });

    }
}