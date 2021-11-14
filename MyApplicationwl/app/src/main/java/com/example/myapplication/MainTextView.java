package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.time.temporal.IsoFields;

public class MainTextView extends TextView {
    public MainTextView(Context context) {
        super(context);
    }

    public MainTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MainTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
