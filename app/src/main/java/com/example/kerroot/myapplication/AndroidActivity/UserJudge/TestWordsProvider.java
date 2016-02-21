package com.example.kerroot.myapplication.AndroidActivity.UserJudge;

/**
 * Created by ker root on 2016/2/19.
 */
import java.util.Arrays;
import java.util.Random;

import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.Word;
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.WordsList;

/*
 * 根据单词词频推荐n个测试单词
 */
public class TestWordsProvider {

    public int n = 50;
    public Word[] testWords = new Word[n];

    public TestWordsProvider(WordsList aWordsList){

        int randomBase = 100000000;
        Random random = new Random();
        int[] a = new int [50];
        double[] pp = new double[aWordsList.wordsNum];
        double sumpp = 0;

        for (int i = 0; i < n; i++)
            a[i] = random.nextInt(randomBase);
        Arrays.sort(a);

        for (int i = 0; i < aWordsList.wordsNum; i++)
            sumpp += Math.sqrt(aWordsList.words[i].p);

        for (int i = 0; i < aWordsList.wordsNum; i++)
            pp[i] = Math.sqrt(aWordsList.words[i].p) / sumpp;

        int j = 0, l = 0;
        double sump = 0;
        for (int i = 0; i < n; i++){
            sump+=pp[j++];
            while (sump + pp[j] < 1.0 * a[i] / randomBase)
                sump += pp[j++];
            aWordsList.words[j].chosenNum = l;
            testWords[l] = new Word();
            testWords[l++].set(aWordsList.words[j]);
        }
        Arrays.sort(testWords);
    }

    public void check(){

        Random random = new Random();
        for (int i = 0; i < n; i++){
            if (random.nextBoolean()) testWords[i].x = 1;
            else testWords[i].x = 0;
        }
    }
}

