package com.example.menuhw;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        TextView txvOrderSummary = findViewById(R.id.txvOrderSummary);

        String mainCourse = getIntent().getStringExtra("mainCourse");
        String sideDish = getIntent().getStringExtra("sideDish");
        String drink = getIntent().getStringExtra("drink");

        String orderSummary = "主餐: " + mainCourse + "\n附餐: " + sideDish + "\n飲料: " + drink;
        txvOrderSummary.setText(orderSummary);
    }
}
