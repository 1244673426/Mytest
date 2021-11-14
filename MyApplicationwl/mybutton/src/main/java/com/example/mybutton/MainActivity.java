package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="leo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button byId = findViewById(R.id.btn);

        //点击事件
//        byId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.e(TAG,"onClick");
//            }
//        });
        //长按事件 优先级比单击事件高 当我们设置为true的时候 单击事件不被触发 触摸事件不受影响
        byId.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.e(TAG,"onLongClick");
                return false;
            }
        });
        //触摸事件 优先级最高 当我们设置为true的时候 其他两个事件不被触发
        byId.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.e(TAG,"ontouch"+motionEvent.getAction());
                return false;
            }
        });

    }

    public void leoWl(View view) {
        Log.e(TAG,"onClick");
    }
}