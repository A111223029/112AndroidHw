package com.example.menuhw;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 获取从MainActivity传递过来的文本
        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");
        String text3 = intent.getStringExtra("text3");

        // 在TextView中显示文本
        TextView txvmain1D = findViewById(R.id.txvmain1D);
        txvmain1D.setText(text1);

        TextView txvmain2D = findViewById(R.id.txvmain2D);
        txvmain2D.setText(text2);

        TextView txvdrinkD = findViewById(R.id.txvdrinkD);
        txvdrinkD.setText(text3);
    }

}
