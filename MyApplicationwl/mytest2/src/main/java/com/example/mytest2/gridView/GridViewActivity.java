package com.example.mytest2.gridView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.mytest2.R;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.gv);
        gridView.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
    }
}