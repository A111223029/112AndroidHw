package com.example.radiohw_;




import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outputStr = "";




                RadioButton boy = (RadioButton) findViewById(R.id.rdbBoy);
                RadioButton girl = (RadioButton) findViewById(R.id.rdbGirl);
                if(boy.isChecked())
                    outputStr += "男生\n";
                else if(girl.isChecked())
                    outputStr += "女生\n";




                RadioGroup type = (RadioGroup) findViewById(R.id.rgType);
//                switch (type.getCheckedRadioButtonId()){
//                    case R.id.rdbAdult:
//                        outputStr += "全票\n";
//                        break;
//                    case R.id.rdbChild:
//                        outputStr += "兒童票\n";
//                        break;
//                    case R.id.rdbStudent:
//                        outputStr += "學生票\n";
//                        break;
//                }
                if(type.getCheckedRadioButtonId()== R.id.rdbAdult)
                    outputStr += "全票\n";
                else if(type.getCheckedRadioButtonId()== R.id.rdbChild)
                    outputStr += "兒童票\n";
                else
                    outputStr += "學生票\n";


                //幾張票
                EditText editTextNumber = findViewById(R.id.editTextNumber);
                // 獲取 EditText 中的數字
                int number = Integer.parseInt(editTextNumber.getText().toString());


                if(number>0)
                    outputStr += "共"+String.valueOf(number)+"張\n";
                else
                    outputStr += "未購買\n";


                //總價
                int price = 0;
                RadioButton adultNTD = findViewById(R.id.rdbAdult);
                RadioButton childNTD = findViewById(R.id.rdbChild);
                RadioButton studentNTD = findViewById(R.id.rdbStudent);
                EditText quantityEditText = findViewById(R.id.editTextNumber);


                // 判斷選擇的票種，並設定相應的價格
                if (adultNTD.isChecked()) {
                    price = 500;
                } else if (childNTD.isChecked()) {
                    price = 250;
                } else if (studentNTD.isChecked()) {
                    price = 400;
                }
                // 獲取輸入的張數
                int quantity = Integer.parseInt(quantityEditText.getText().toString());
                // 計算總金額
                int totalPrice = price * quantity;
                // 將總金額輸出到 outputStr
                outputStr += "總金額：" + totalPrice + "元";










                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText(outputStr);
            }
        });
    }
}
