package com.example.recycleveiw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkList<Movie> moviesLIst = newLinklist<>();
        //Put initial into the word list.
        for (int i = 0; i <= 10; i++){
            moviesLIst.add(new Movie)
        }

    }
}
