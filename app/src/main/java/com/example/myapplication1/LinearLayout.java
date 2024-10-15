package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class LinearLayout extends AppCompatActivity implements View.OnClickListener{
    Button btnLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
    }

    @Override
    public void onClick(View v) {
    }

}
