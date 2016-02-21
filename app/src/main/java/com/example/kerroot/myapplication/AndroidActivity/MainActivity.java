package com.example.kerroot.myapplication.AndroidActivity;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.DataReader;
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.WordsList;
import com.example.kerroot.myapplication.AndroidActivity.UserJudge.TestWordsProvider;
import com.example.kerroot.myapplication.R;

import java.io.InputStream;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonTest = (Button) findViewById(R.id.button_test);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
        Button buttonWordList = (Button) findViewById(R.id.button_wordList);
        buttonWordList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WordListActivity.class);
                startActivity(intent);
            }
        });
    }
}
