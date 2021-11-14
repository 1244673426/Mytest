package com.example.mydeittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText et;
private static final String TAG ="lei" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btn = findViewById(R.id.btn);
        et = findViewById(R.id.et);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i(TAG, "leoWl: "+et.getText().toString());
//            }
//        });
    }

    public void leoWl(View view) {
        Log.i(TAG, "leoWl: "+et.getText().toString()    );
    }

}