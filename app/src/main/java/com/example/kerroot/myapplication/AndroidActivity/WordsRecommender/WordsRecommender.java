package com.example.kerroot.myapplication.AndroidActivity.WordsRecommender;

/**
 * Created by ker root on 2016/2/19.
 */
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.Word;
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.WordsList;
import com.example.kerroot.myapplication.AndroidActivity.UserJudge.TestWordsProvider;

import java.util.Arrays;

public class WordsRecommender {

    public int m = 150;
    public int k = 5;
    public int cnt = 0;
    public Word[] ans = new Word[m];
    public Word[] temp = new Word[2500];

    public WordsRecommender(WordsList A, TestWordsProvider B){

        int l = 0, r = k - 1;
        double sum = 0;
        for (int i = l; i <= r; i++)
            sum += B.testWords[i].x;
        for (int i = 0; i < A.wordsNum; i++){

            if (A.words[i].chosenNum != -1){
                A.words[i].x = B.testWords[A.words[i].chosenNum].x;
                A.words[i].keyM = (1 - A.words[i].x) * A.words[i].p;
                continue;
            }
            while (r < B.n && Math.abs(B.testWords[r + 1].p - A.words[i].p) <
                    Math.abs(B.testWords[l].p - A.words[i].p)){

                sum -= B.testWords[l].x;
                l++;
                r++;
                sum += B.testWords[r].x;
            }
            A.words[i].x = sum / k;
            A.words[i].keyM = (1 - A.words[i].x) * A.words[i].p;
        }
        for (int i = 0; i < A.wordsNum; i++){
            temp[i] = new Word();
            temp[i].set(A.words[i]);
        }
        getFirstMWords(0, A.wordsNum - 1, m, cnt);
        Arrays.sort(ans);
    }

    private void swap(Word a, Word b){

        Word t = new Word();
        t.set(a);
        a.set(b);
        b.set(t);
    }

    private Word median(Word a, Word b, Word c){

        if (a.keyM < b.keyM) swap(a, b);
        if (a.keyM < c.keyM) swap(a, c);
        if (b.keyM < c.keyM) swap(b, c);
        swap(b, c);
        return c;
    }

    public void getFirstMWords(int l, int r, int k, int cnt){

        if (l == r){
            ans[cnt] = new Word();
            ans[cnt++].set(temp[l]);
            return;
        }

        if (l + 1 == r){
            if (temp[l].keyM < temp[r].keyM) swap(temp[l], temp[r]);
            ans[cnt] = new Word();
            ans[cnt++].set(temp[l]);
            if (k == 2){
                ans[cnt] = new Word();
                ans[cnt++].set(temp[r]);
            }
            return;
        }

        Word x = new Word();
        x.set(median(temp[l], temp[(l + r) >> 1], temp[r]));
        int i = l, j = r;
        while (i < j){
            while (temp[++i].keyM > x.keyM) ;
            while (temp[--j].keyM < x.keyM) ;
            if (i < j) swap(temp[i], temp[j]);
        }
        swap(temp[i], temp[r]);
        if (i - l >= k && k > 0) getFirstMWords(l, i - 1, k, cnt);
        else{
            for (int p = l; p <= i; p++){
                ans[cnt] = new Word();
                ans[cnt++].set(temp[p]);
            }
            if (i - l + 1 < k) getFirstMWords(i + 1, r, k - (i - l + 1), cnt);
        }
    }
}

