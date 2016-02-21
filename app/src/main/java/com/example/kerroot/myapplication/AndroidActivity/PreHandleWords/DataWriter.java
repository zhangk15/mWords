package com.example.kerroot.myapplication.AndroidActivity.PreHandleWords;

/**
 * Created by ker root on 2016/2/19.
 */
import android.content.Context;

import com.example.kerroot.myapplication.AndroidActivity.WordsRecommender.WordsRecommender;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class DataWriter{

    //PC
    public static void writeData(WordsList A) throws IOException{

        FileOutputStream file = new FileOutputStream("c://TestFindKeyWords//data.txt");
        @SuppressWarnings("resource")
        PrintStream printer = new PrintStream(file);

        printer.println("wordsNum is " + A.wordsNum + "****");
        printer.println("sumOfWordNum is " + A.sumOfWordNum + "****");
        printer.println("examsDataNum is " + A.examsDataNum + "****");
        printer.println("wordsNumInEachExam is " + A.wordsNumInEachExam + "****");

        for (int i = 0; i < A.wordsNum; i++){
            printer.print("****" + A.words[i].word + "****" + A.words[i].Chinese);
            printer.printf("****%d****%.10f****%.10f****\n",  A.words[i].num, A.words[i].p, A.words[i].q);
        }
    }

    //Phone
    public static void writeWordList(WordsRecommender aWordsRecommender, FileOutputStream out) throws IOException{

        String content = "\n\n\nthe recommendatory words list\n\n\n";
        for (int i = 0; i < aWordsRecommender.m; i++){
            content+=aWordsRecommender.ans[i].word+' '+aWordsRecommender.ans[i].Chinese+"\n\n";
        }
        BufferedWriter writer = null;
        writer = new BufferedWriter(new OutputStreamWriter(out));
        writer.write(content);
        writer.close();
    }
}
