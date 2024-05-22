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
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView listView;
    TextView txvmain1C, txvmain2C, txvdrinkC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_main);
        listView = findViewById(R.id.listview);
        txvmain1C = findViewById(R.id.txvmain1C);
        txvmain2C = findViewById(R.id.txvmain2C);
        txvdrinkC = findViewById(R.id.txvdrinkC);

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
            listView.setOnItemClickListener((parent, view, position1, id) -> {
                String selectedItem = (String) parent.getItemAtPosition(position1);
                txvmain1C.setText(selectedItem);
            });
        } else if (position == 1) {
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.order2, android.R.layout.simple_list_item_1);
            listView.setOnItemClickListener((parent, view, position12, id) -> {
                String selectedItem = (String) parent.getItemAtPosition(position12);
                txvmain2C.setText(selectedItem);
            });
        } else {
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.order3, android.R.layout.simple_list_item_1);
            listView.setOnItemClickListener((parent, view, position13, id) -> {
                String selectedItem = (String) parent.getItemAtPosition(position13);
                txvdrinkC.setText(selectedItem);
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
        int id = item.getItemId();
        if (id == R.id.Send) {
            sendOrder();
            return true;
        } else if (id == R.id.Cancel) {
            resetOrder();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    private void sendOrder() {
        Intent intent = new Intent(this, OrderSummaryActivity.class);
        intent.putExtra("mainCourse", txvmain1C.getText().toString());
        intent.putExtra("sideDish", txvmain2C.getText().toString());
        intent.putExtra("drink", txvdrinkC.getText().toString());
        startActivity(intent);
    }

    private void resetOrder() {
        txvmain1C.setText("請選擇");
        txvmain2C.setText("請選擇");
        txvdrinkC.setText("請選擇");
    }
}
