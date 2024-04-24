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

        // 获取传递的数据
        Intent intent = getIntent();
        String outputStr = intent.getStringExtra("outputString");

        // 现在你可以使用outputStr进行你的操作，例如将它设置到TextView中显示
        TextView outputTextView = findViewById(R.id.outputTextView);
        outputTextView.setText(outputStr);
    }


}
