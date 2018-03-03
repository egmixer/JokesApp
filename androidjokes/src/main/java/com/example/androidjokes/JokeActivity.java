package com.example.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeTxt = findViewById(R.id.joke_tv);
        String joke = getIntent().getStringExtra("joke");
        if (joke != null)
            jokeTxt.setText(joke);
        else
            jokeTxt.setText(R.string.no_jokes);
    }
}
