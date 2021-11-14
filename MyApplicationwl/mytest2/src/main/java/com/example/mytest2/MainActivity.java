package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.mytest2.gridView.GridViewActivity;
import com.example.mytest2.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button editText;
    private Button radioButton;
    private Button checkBox;
    private Button imageView;
    private Button listView;
    private Button gridView;
    private Button recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.wl2);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        radioButton = findViewById(R.id.rd_1);
        checkBox = findViewById(R.id.checkbox);
        imageView = findViewById(R.id.imageview);
        listView = findViewById(R.id.listView);
        gridView = findViewById(R.id.GridView);
        recyclerView = findViewById(R.id.recyclerView);
        setListeners();

    }
    private void setListeners(){
        onClick onClick = new onClick();
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        editText.setOnClickListener(onClick);
        radioButton.setOnClickListener(onClick);
        checkBox.setOnClickListener(onClick);
        imageView.setOnClickListener(onClick);
        listView.setOnClickListener(onClick);
        gridView.setOnClickListener(onClick);
        recyclerView.setOnClickListener(onClick);
    }

    private class onClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.button2:
                    intent = new Intent(MainActivity.this, MainActivityButton.class);
                    startActivity(intent);
                    break;
                case R.id.wl2:
                    intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                    break;
                case R.id.editText:
                    intent = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent);
                    break;
                case R.id.rd_1:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageview:
                    intent  = new Intent(MainActivity.this, ImageViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.listView:
                    intent  = new Intent(MainActivity.this, ListViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.GridView:
                    intent  = new Intent(MainActivity.this, GridViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.recyclerView:
                    intent  = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

}