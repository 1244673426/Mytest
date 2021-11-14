package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityButton extends AppCompatActivity {
    private Button button1;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button);
        button1 = findViewById(R.id.botton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivityButton.this,"我被点击了2",Toast.LENGTH_SHORT).show();
            }
        });
        textView1 = findViewById(R.id.tv_1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivityButton.this,"我是tv1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showTost(View view) {
        Toast.makeText(this,"我被点击了",Toast.LENGTH_LONG).show();
    }
}