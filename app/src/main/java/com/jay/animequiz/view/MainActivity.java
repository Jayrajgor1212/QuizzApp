package com.jay.animequiz.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.jay.animequiz.R;
import com.jay.animequiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        setUpListeners();
    }
    private void setUpListeners(){
        bind.btnPlay.setOnClickListener(view-> startActivity(new Intent(MainActivity.this, QuizActivity.class)));
        bind.btnSeeRanking.setOnClickListener(v-> startActivity(new Intent(MainActivity.this,RankingActivity.class)));
    }
}