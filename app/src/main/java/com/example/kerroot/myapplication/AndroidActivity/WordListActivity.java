package com.example.kerroot.myapplication.AndroidActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.DataReader;
import com.example.kerroot.myapplication.R;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by ker root on 2016/2/19.
 */
public class WordListActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordlist);
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView.setText("changed!");

        //logic
        String wordlist = "";
        try {
            FileInputStream in = null;
            in = openFileInput("wordlist");
            wordlist = DataReader.getInputStreamContent(in);
            textView.setText(wordlist);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
