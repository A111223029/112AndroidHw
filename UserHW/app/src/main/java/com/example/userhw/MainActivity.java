package com.example.userhw;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view){
        EditText edtUsername = findViewById(R.id.edtUsername);
        EditText edtPassword = findViewById(R.id.edtPassword);
        TextView txvShow = findViewById(R.id.txvShow);

        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        if (username.equals("user") && password.equals("tt123")) {
            txvShow.setText("登入成功");
        } else {
            txvShow.setText("帳號或密碼錯誤");
        }
    }
}
