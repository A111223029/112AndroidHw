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


    public void button_Click(View viem){
        EditText edtTemp=(EditText) findViewById(R.id.edtTemp);
        EditText edtTemp2=(EditText) findViewById(R.id.edtTemp2);
        TextView txvShow=(TextView) findViewById(R.id.txvShow);
        //double degreeC=Double.parseDouble(edtTemp.getText().toString());
        //double degreeF=(9.0*degreeC)/5.0+32.0;


        String username = edtTemp.getText().toString();
        String password = edtTemp2.getText().toString();


        if (username.equals("user") && password.equals("tt123")) {
            txvShow.setText("登入成功");
        } else {
            txvShow.setText("帳號或密碼錯誤");
        }


        //txvShow.setText("華氏溫度："+String.format("%.2f",degreeF)); //小數點後二位


    }
}
