package com.example.radiohw_;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 獲取傳遞的數據
        Intent intent = getIntent();
        String outputStr = intent.getStringExtra("outputString");

        // 現在你可以使用outputStr進行你的操作，例如將它設定到TextView中顯示
        TextView outputTextView = findViewById(R.id.outputTextView);
        outputTextView.setText(outputStr);
    }


}
