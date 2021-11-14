package com.example.mytest2;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private TextView mTV4;
    private TextView mTV5;
    private TextView mTV3;
    private TextView mTV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mTV4=findViewById(R.id.wl5);
        mTV4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTV4.getPaint().setAntiAlias(true);//去掉锯齿
        mTV5=findViewById(R.id.wl4);
        mTV5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        mTV3=findViewById(R.id.wl3);
        mTV3.setText(Html.fromHtml("<u>明月几时有，把酒问青天，不知天上宫阙，今夕是何年？</u>"));

    }
}