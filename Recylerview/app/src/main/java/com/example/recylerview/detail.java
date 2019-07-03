package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        String title = intent.getStringExtra("KEY_TITLE");

        TextView textView = findViewById(R.id.textView3);
        textView.setText(title);
    }
}
