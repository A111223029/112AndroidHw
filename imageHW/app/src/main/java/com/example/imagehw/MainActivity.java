package com.example.imagehw;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView burgerImageView, friesImageView, drinkImageView, soupImageView;
    private CheckBox burgerCheckBox, friesCheckBox, drinkCheckBox, soupCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageViews
        burgerImageView = findViewById(R.id.output1);
        friesImageView = findViewById(R.id.output2);
        drinkImageView = findViewById(R.id.output3);
        soupImageView = findViewById(R.id.output4);

        // Initialize CheckBoxes
        burgerCheckBox = findViewById(R.id.chk1);
        friesCheckBox = findViewById(R.id.chk2);
        drinkCheckBox = findViewById(R.id.chk3);
        soupCheckBox = findViewById(R.id.chk4);
        // Set onClickListener for burger CheckBox
        burgerCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (burgerCheckBox.isChecked()) {
                    burgerImageView.setVisibility(View.VISIBLE);
                } else {
                    burgerImageView.setVisibility(View.GONE);
                }
            }
        });

        // Set onClickListener for fries CheckBox
        friesCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (friesCheckBox.isChecked()) {
                    friesImageView.setVisibility(View.VISIBLE);
                } else {
                    friesImageView.setVisibility(View.GONE);
                }
            }
        });

        // Set onClickListener for drink CheckBox
        drinkCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drinkCheckBox.isChecked()) {
                    drinkImageView.setVisibility(View.VISIBLE);
                } else {
                    drinkImageView.setVisibility(View.GONE);
                }
            }
        });

        soupCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soupCheckBox.isChecked()) {
                    soupImageView.setVisibility(View.VISIBLE);
                } else {
                    soupImageView.setVisibility(View.GONE);
                }
            }
        });
    }
}