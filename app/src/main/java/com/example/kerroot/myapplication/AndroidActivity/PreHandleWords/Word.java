package com.example.kerroot.myapplication.AndroidActivity.PreHandleWords;

/**
 * Created by ker root on 2016/2/19.
 */
import java.lang.Comparable;

public class Word implements Comparable<Word>{

    public String word;
    public String Chinese;
    public int num;
    public int chosenNum;
    public double p, q, x;
    public double keyM;

    public Word(String s){
        //s looks like "abbreviation##n.鑺傜暐锛岀缉鍐欙紝缂╃煭"
        int x = s.indexOf("##");
        word = s.substring(0, x);
        Chinese = s.substring(x+2);
    }

    public Word() {
        // TODO Auto-generated constructor stub
        chosenNum = -1;
    }

    public void set(Word a){
        word = a.word;
        Chinese = a.Chinese;
        num = a.num;
        chosenNum = a.chosenNum;
        p = a.p;
        q = a.q;
        x = a.x;
        keyM = a.keyM;
    }

    public void calcQ(int k){

        double x = 1 - p, y = 1;
        for (int i = 0; i < k; i++)
            y *= x;
        q = 1 - y;
    }

    @Override
    public int compareTo(Word b){

        if (this.p < b.p) return 1;
        if (this.p > b.p) return -1;
        return 0;
    }
}

