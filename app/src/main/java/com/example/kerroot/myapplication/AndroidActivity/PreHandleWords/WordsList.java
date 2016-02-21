package com.example.kerroot.myapplication.AndroidActivity.PreHandleWords;

/**
 * Created by ker root on 2016/2/19.
 */
import java.io.IOException;
import java.util.Arrays;

public class WordsList {

    public Word[] words = new Word[2084];
    public int wordsNum;
    public int sumOfWordNum;
    public int examsDataNum;
    public int wordsNumInEachExam;

    private String wordsListContent;
    private String examDataContent;

    public static void main(String[] args) throws IOException {

    }

    public WordsList() throws IOException {

        wordsListContent = DataReader.readWordsList();
        examDataContent = DataReader.readExamsData();
        wordsNum = 0;
        sumOfWordNum = 0;
        int x = wordsListContent.indexOf("**@@**", 0);
        while (x != -1){
            int y = wordsListContent.indexOf("@@**", x + 6);
            words[wordsNum] = new Word(wordsListContent.substring(x + 6, y));
            x = wordsListContent.indexOf("**@@**", y);
            words[wordsNum].num = 1 + countWord(" "+words[wordsNum].word+" ");
            sumOfWordNum += words[wordsNum].num;
            wordsNum++;
        }
        examsDataNum = DataReader.getExamsDataNum();
        wordsNumInEachExam = sumOfWordNum / examsDataNum;
        for (int i = 0; i < wordsNum; i++){
            words[i].p = 1.0 * words[i].num / sumOfWordNum;
            words[i].calcQ(wordsNumInEachExam);
            if (words[i].num >= 100) System.out.println();
        }

        System.out.println(wordsNum);
    }


    public WordsList(String s){

        int x, y;
	/*	x = s.indexOf("wordsNum is ", 0);
		y = s.indexOf("**", x + 12);
		wordsNum = Integer.valueOf(s.substring(x + 12, y));
	*/
        wordsNum = 0;

        x = s.indexOf("sumOfWordNum is ", 0);
        y = s.indexOf("****", x + 16);
        sumOfWordNum = Integer.valueOf(s.substring(x + 16, y));

        x = s.indexOf("examsDataNum is ", y);
        y = s.indexOf("****", x + 16);
        examsDataNum = Integer.valueOf(s.substring(x + 16, y));

        x = s.indexOf("wordsNumInEachExam is ", y);
        y = s.indexOf("****", x + 22);
        wordsNumInEachExam = Integer.valueOf(s.substring(x + 22, y));

        x = s.indexOf("****", y + 4);
        while (x != -1){
            y = s.indexOf("****", x + 4);
            words[wordsNum] = new Word();
            words[wordsNum].word = s.substring(x + 4, y);
            x = y; y = s.indexOf("****", y + 4);
            words[wordsNum].Chinese = s.substring(x + 4, y);
            x = y; y = s.indexOf("****", y + 4);
            words[wordsNum].num = Integer.valueOf(s.substring(x + 4, y));
            x = y; y = s.indexOf("****", y + 4);
            words[wordsNum].p = Double.valueOf(s.substring(x + 4, y));
            x = y; y = s.indexOf("****", y + 4);
            words[wordsNum].q = Double.valueOf(s.substring(x + 4, y));
            x = s.indexOf("****", y + 4);
            wordsNum++;
        }
 //       sortWords();
    }
    private int countWord(String s){

        int len = s.length();
        int x = 0 - len;
        int cnt = 0;

        while ((x = examDataContent.indexOf(s, x + len)) != -1) cnt++;

        return cnt;
    }

    public void sortWords(){

        Arrays.sort(this.words);
    }
}
