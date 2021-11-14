package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private EditText ed1;
    private EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ed1 = findViewById(R.id.username);
        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String ss = charSequence.toString();
                Log.d("editText:",ss);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void btn(View view) {
        Toast.makeText(this,"登录成功！",Toast.LENGTH_SHORT).show();
    }
}