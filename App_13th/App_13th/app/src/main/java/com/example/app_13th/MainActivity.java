package com.example.app_13th;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);

        LinkedList<String> mWordList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            mWordList.add(i + "");
        }

        // create obj RecycleView
        RecyclerView mRecyclerView = findViewById(R.id.recycleView);

        // create obj Adapter
        WordListAdapter mAdapter = new WordListAdapter(this, mWordList);
        // set Adapter into RecycleView
        mRecyclerView.setAdapter(mAdapter);

        // set layoutManager to define linear or grid view
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
