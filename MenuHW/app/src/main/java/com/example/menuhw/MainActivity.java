package com.example.menuhw;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_main);
        listView = findViewById(R.id.listview);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.SpinnerMain, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                updateListView(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
    }

    private void updateListView(int position) {
        ArrayAdapter<CharSequence> adapter;
        if (position == 0) {
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.order1, android.R.layout.simple_list_item_1);
            // 设置主餐的点击事件
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                    TextView txvmain1C = findViewById(R.id.txvmain1C);
                    String selectedItem = (String) parent.getItemAtPosition(position);
                    txvmain1C.setText(selectedItem);
                }
            });
        } else if (position == 1) {
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.order2, android.R.layout.simple_list_item_1);
            // 设置附餐的点击事件
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                    TextView txvmain2C = findViewById(R.id.txvmain2C);
                    String selectedItem = (String) parent.getItemAtPosition(position);
                    txvmain2C.setText(selectedItem);
                }
            });
        } else {
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.order3, android.R.layout.simple_list_item_1);
            // 设置飲料的点击事件
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                    TextView txvdrinkC = findViewById(R.id.txvdrinkC);
                    String selectedItem = (String) parent.getItemAtPosition(position);
                    txvdrinkC.setText(selectedItem);
                }
            });
        }
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemID = item.getItemId();
        if (itemID == R.id.Send) {
            // 创建一个新的Intent对象
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            // 获取当前TextView的内容
            TextView txvmain1C = findViewById(R.id.txvmain1C);
            String text1 = txvmain1C.getText().toString();
            TextView txvmain2C = findViewById(R.id.txvmain2C);
            String text2 = txvmain2C.getText().toString();
            TextView txvdrinkC = findViewById(R.id.txvdrinkC);
            String text3 = txvdrinkC.getText().toString();

            // 将内容添加到Intent中
            intent.putExtra("text1", text1);
            intent.putExtra("text2", text2);
            intent.putExtra("text3", text3);

            // 启动第二个活动
            startActivity(intent);

            return true;
        } else if (itemID == R.id.Cancel) {
            TextView txvmain1C = findViewById(R.id.txvmain1C);
            TextView txvmain2C = findViewById(R.id.txvmain2C);
            TextView txvdrinkC = findViewById(R.id.txvdrinkC);

            // 將 TextView 重置為初始狀態
            txvmain1C.setText("請選擇");
            txvmain2C.setText("請選擇");
            txvdrinkC.setText("請選擇");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
