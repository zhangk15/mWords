package com.example.kerroot.myapplication.AndroidActivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.DataReader;
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.DataWriter;
import com.example.kerroot.myapplication.AndroidActivity.PreHandleWords.WordsList;
import com.example.kerroot.myapplication.AndroidActivity.UserJudge.TestWordsProvider;
import com.example.kerroot.myapplication.AndroidActivity.WordsRecommender.WordsRecommender;
import com.example.kerroot.myapplication.R;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by ker root on 2016/2/19.
 */
public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getSupportActionBar().hide();

        //logic
        String data = "";
        try {
            InputStream inputStream = getResources().openRawResource(R.raw.data);
            data = DataReader.getInputStreamContent(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }

        final WordsList aWordsList = new WordsList(data);
        final TestWordsProvider aTestWordsProvider = new TestWordsProvider(aWordsList);
        
        final CheckBox checkBox01 = (CheckBox) findViewById(R.id.checkbox01);
        checkBox01.setText(aTestWordsProvider.testWords[0].word);
        final CheckBox checkBox02 = (CheckBox) findViewById(R.id.checkbox02);
        checkBox02.setText(aTestWordsProvider.testWords[1].word);
        final CheckBox checkBox03 = (CheckBox) findViewById(R.id.checkbox03);
        checkBox03.setText(aTestWordsProvider.testWords[2].word);
        final CheckBox checkBox04 = (CheckBox) findViewById(R.id.checkbox04);
        checkBox04.setText(aTestWordsProvider.testWords[3].word);
        final CheckBox checkBox05 = (CheckBox) findViewById(R.id.checkbox05);
        checkBox05.setText(aTestWordsProvider.testWords[4].word);

        final CheckBox checkBox06 = (CheckBox) findViewById(R.id.checkbox06);
        checkBox06.setText(aTestWordsProvider.testWords[5].word);
        final CheckBox checkBox07 = (CheckBox) findViewById(R.id.checkbox07);
        checkBox07.setText(aTestWordsProvider.testWords[6].word);
        final CheckBox checkBox08 = (CheckBox) findViewById(R.id.checkbox08);
        checkBox08.setText(aTestWordsProvider.testWords[7].word);
        final CheckBox checkBox09 = (CheckBox) findViewById(R.id.checkbox09);
        checkBox09.setText(aTestWordsProvider.testWords[8].word);
        final CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkBox10.setText(aTestWordsProvider.testWords[9].word);

        final CheckBox checkBox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkBox11.setText(aTestWordsProvider.testWords[10].word);
        final CheckBox checkBox12 = (CheckBox) findViewById(R.id.checkbox12);
        checkBox12.setText(aTestWordsProvider.testWords[11].word);
        final CheckBox checkBox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkBox13.setText(aTestWordsProvider.testWords[12].word);
        final CheckBox checkBox14 = (CheckBox) findViewById(R.id.checkbox14);
        checkBox14.setText(aTestWordsProvider.testWords[13].word);
        final CheckBox checkBox15 = (CheckBox) findViewById(R.id.checkbox15);
        checkBox15.setText(aTestWordsProvider.testWords[14].word);

        final CheckBox checkBox16 = (CheckBox) findViewById(R.id.checkbox16);
        checkBox16.setText(aTestWordsProvider.testWords[15].word);
        final CheckBox checkBox17 = (CheckBox) findViewById(R.id.checkbox17);
        checkBox17.setText(aTestWordsProvider.testWords[16].word);
        final CheckBox checkBox18 = (CheckBox) findViewById(R.id.checkbox18);
        checkBox18.setText(aTestWordsProvider.testWords[17].word);
        final CheckBox checkBox19 = (CheckBox) findViewById(R.id.checkbox19);
        checkBox19.setText(aTestWordsProvider.testWords[18].word);
        final CheckBox checkBox20 = (CheckBox) findViewById(R.id.checkbox20);
        checkBox20.setText(aTestWordsProvider.testWords[19].word);

        final CheckBox checkBox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkBox21.setText(aTestWordsProvider.testWords[20].word);
        final CheckBox checkBox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkBox22.setText(aTestWordsProvider.testWords[21].word);
        final CheckBox checkBox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkBox23.setText(aTestWordsProvider.testWords[22].word);
        final CheckBox checkBox24 = (CheckBox) findViewById(R.id.checkbox24);
        checkBox24.setText(aTestWordsProvider.testWords[23].word);
        final CheckBox checkBox25 = (CheckBox) findViewById(R.id.checkbox25);
        checkBox25.setText(aTestWordsProvider.testWords[24].word);

        final CheckBox checkBox26 = (CheckBox) findViewById(R.id.checkbox26);
        checkBox26.setText(aTestWordsProvider.testWords[25].word);
        final CheckBox checkBox27 = (CheckBox) findViewById(R.id.checkbox27);
        checkBox27.setText(aTestWordsProvider.testWords[26].word);
        final CheckBox checkBox28 = (CheckBox) findViewById(R.id.checkbox28);
        checkBox28.setText(aTestWordsProvider.testWords[27].word);
        final CheckBox checkBox29 = (CheckBox) findViewById(R.id.checkbox29);
        checkBox29.setText(aTestWordsProvider.testWords[28].word);
        final CheckBox checkBox30 = (CheckBox) findViewById(R.id.checkbox30);
        checkBox30.setText(aTestWordsProvider.testWords[29].word);

        final CheckBox checkBox31 = (CheckBox) findViewById(R.id.checkbox31);
        checkBox31.setText(aTestWordsProvider.testWords[30].word);
        final CheckBox checkBox32 = (CheckBox) findViewById(R.id.checkbox32);
        checkBox32.setText(aTestWordsProvider.testWords[31].word);
        final CheckBox checkBox33 = (CheckBox) findViewById(R.id.checkbox33);
        checkBox33.setText(aTestWordsProvider.testWords[32].word);
        final CheckBox checkBox34 = (CheckBox) findViewById(R.id.checkbox34);
        checkBox34.setText(aTestWordsProvider.testWords[33].word);
        final CheckBox checkBox35 = (CheckBox) findViewById(R.id.checkbox35);
        checkBox35.setText(aTestWordsProvider.testWords[34].word);

        final CheckBox checkBox36 = (CheckBox) findViewById(R.id.checkbox36);
        checkBox36.setText(aTestWordsProvider.testWords[35].word);
        final CheckBox checkBox37 = (CheckBox) findViewById(R.id.checkbox37);
        checkBox37.setText(aTestWordsProvider.testWords[36].word);
        final CheckBox checkBox38 = (CheckBox) findViewById(R.id.checkbox38);
        checkBox38.setText(aTestWordsProvider.testWords[37].word);
        final CheckBox checkBox39 = (CheckBox) findViewById(R.id.checkbox39);
        checkBox39.setText(aTestWordsProvider.testWords[38].word);
        final CheckBox checkBox40 = (CheckBox) findViewById(R.id.checkbox40);
        checkBox40.setText(aTestWordsProvider.testWords[39].word);

        final CheckBox checkBox41 = (CheckBox) findViewById(R.id.checkbox41);
        checkBox41.setText(aTestWordsProvider.testWords[40].word);
        final CheckBox checkBox42 = (CheckBox) findViewById(R.id.checkbox42);
        checkBox42.setText(aTestWordsProvider.testWords[41].word);
        final CheckBox checkBox43 = (CheckBox) findViewById(R.id.checkbox43);
        checkBox43.setText(aTestWordsProvider.testWords[42].word);
        final CheckBox checkBox44 = (CheckBox) findViewById(R.id.checkbox44);
        checkBox44.setText(aTestWordsProvider.testWords[43].word);
        final CheckBox checkBox45 = (CheckBox) findViewById(R.id.checkbox45);
        checkBox45.setText(aTestWordsProvider.testWords[44].word);

        final CheckBox checkBox46 = (CheckBox) findViewById(R.id.checkbox46);
        checkBox46.setText(aTestWordsProvider.testWords[45].word);
        final CheckBox checkBox47 = (CheckBox) findViewById(R.id.checkbox47);
        checkBox47.setText(aTestWordsProvider.testWords[46].word);
        final CheckBox checkBox48 = (CheckBox) findViewById(R.id.checkbox48);
        checkBox48.setText(aTestWordsProvider.testWords[47].word);
        final CheckBox checkBox49 = (CheckBox) findViewById(R.id.checkbox49);
        checkBox49.setText(aTestWordsProvider.testWords[48].word);
        final CheckBox checkBox50 = (CheckBox) findViewById(R.id.checkbox50);
        checkBox50.setText(aTestWordsProvider.testWords[49].word);

        Button buttonSubmit = (Button) findViewById(R.id.button_submit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                aTestWordsProvider.check();

                if (checkBox01.isChecked()){
                    aTestWordsProvider.testWords[0].x = 1;
                } else{
                    aTestWordsProvider.testWords[0].x = 0;
                }
                if (checkBox02.isChecked()){
                    aTestWordsProvider.testWords[1].x = 1;
                } else{
                    aTestWordsProvider.testWords[1].x = 0;
                }
                if (checkBox03.isChecked()){
                    aTestWordsProvider.testWords[2].x = 1;
                } else{
                    aTestWordsProvider.testWords[2].x = 0;
                }
                if (checkBox04.isChecked()){
                    aTestWordsProvider.testWords[3].x = 1;
                } else{
                    aTestWordsProvider.testWords[3].x = 0;
                }
                if (checkBox05.isChecked()){
                    aTestWordsProvider.testWords[4].x = 1;
                } else{
                    aTestWordsProvider.testWords[4].x = 0;
                }

                if (checkBox06.isChecked()){
                    aTestWordsProvider.testWords[5].x = 1;
                } else{
                    aTestWordsProvider.testWords[5].x = 0;
                }
                if (checkBox07.isChecked()){
                    aTestWordsProvider.testWords[6].x = 1;
                } else{
                    aTestWordsProvider.testWords[6].x = 0;
                }
                if (checkBox08.isChecked()){
                    aTestWordsProvider.testWords[7].x = 1;
                } else{
                    aTestWordsProvider.testWords[7].x = 0;
                }
                if (checkBox09.isChecked()){
                    aTestWordsProvider.testWords[8].x = 1;
                } else{
                    aTestWordsProvider.testWords[8].x = 0;
                }
                if (checkBox10.isChecked()){
                    aTestWordsProvider.testWords[9].x = 1;
                } else{
                    aTestWordsProvider.testWords[9].x = 0;
                }

                if (checkBox11.isChecked()){
                    aTestWordsProvider.testWords[10].x = 1;
                } else{
                    aTestWordsProvider.testWords[10].x = 0;
                }
                if (checkBox12.isChecked()){
                    aTestWordsProvider.testWords[11].x = 1;
                } else{
                    aTestWordsProvider.testWords[11].x = 0;
                }
                if (checkBox13.isChecked()){
                    aTestWordsProvider.testWords[12].x = 1;
                } else{
                    aTestWordsProvider.testWords[12].x = 0;
                }
                if (checkBox14.isChecked()){
                    aTestWordsProvider.testWords[13].x = 1;
                } else{
                    aTestWordsProvider.testWords[13].x = 0;
                }
                if (checkBox15.isChecked()){
                    aTestWordsProvider.testWords[14].x = 1;
                } else{
                    aTestWordsProvider.testWords[14].x = 0;
                }

                if (checkBox16.isChecked()){
                    aTestWordsProvider.testWords[15].x = 1;
                } else{
                    aTestWordsProvider.testWords[15].x = 0;
                }
                if (checkBox17.isChecked()){
                    aTestWordsProvider.testWords[16].x = 1;
                } else{
                    aTestWordsProvider.testWords[16].x = 0;
                }
                if (checkBox18.isChecked()){
                    aTestWordsProvider.testWords[17].x = 1;
                } else{
                    aTestWordsProvider.testWords[17].x = 0;
                }
                if (checkBox19.isChecked()){
                    aTestWordsProvider.testWords[18].x = 1;
                } else{
                    aTestWordsProvider.testWords[18].x = 0;
                }
                if (checkBox20.isChecked()){
                    aTestWordsProvider.testWords[19].x = 1;
                } else{
                    aTestWordsProvider.testWords[19].x = 0;
                }

                if (checkBox21.isChecked()){
                    aTestWordsProvider.testWords[20].x = 1;
                } else{
                    aTestWordsProvider.testWords[20].x = 0;
                }
                if (checkBox22.isChecked()){
                    aTestWordsProvider.testWords[21].x = 1;
                } else{
                    aTestWordsProvider.testWords[21].x = 0;
                }
                if (checkBox23.isChecked()){
                    aTestWordsProvider.testWords[22].x = 1;
                } else{
                    aTestWordsProvider.testWords[22].x = 0;
                }
                if (checkBox24.isChecked()){
                    aTestWordsProvider.testWords[23].x = 1;
                } else{
                    aTestWordsProvider.testWords[23].x = 0;
                }
                if (checkBox25.isChecked()){
                    aTestWordsProvider.testWords[24].x = 1;
                } else{
                    aTestWordsProvider.testWords[24].x = 0;
                }

                if (checkBox26.isChecked()){
                    aTestWordsProvider.testWords[25].x = 1;
                } else{
                    aTestWordsProvider.testWords[25].x = 0;
                }
                if (checkBox27.isChecked()){
                    aTestWordsProvider.testWords[26].x = 1;
                } else{
                    aTestWordsProvider.testWords[26].x = 0;
                }
                if (checkBox28.isChecked()){
                    aTestWordsProvider.testWords[27].x = 1;
                } else{
                    aTestWordsProvider.testWords[27].x = 0;
                }
                if (checkBox29.isChecked()){
                    aTestWordsProvider.testWords[28].x = 1;
                } else{
                    aTestWordsProvider.testWords[28].x = 0;
                }
                if (checkBox30.isChecked()){
                    aTestWordsProvider.testWords[29].x = 1;
                } else{
                    aTestWordsProvider.testWords[29].x = 0;
                }

                if (checkBox31.isChecked()){
                    aTestWordsProvider.testWords[30].x = 1;
                } else{
                    aTestWordsProvider.testWords[30].x = 0;
                }
                if (checkBox32.isChecked()){
                    aTestWordsProvider.testWords[31].x = 1;
                } else{
                    aTestWordsProvider.testWords[31].x = 0;
                }
                if (checkBox33.isChecked()){
                    aTestWordsProvider.testWords[32].x = 1;
                } else{
                    aTestWordsProvider.testWords[32].x = 0;
                }
                if (checkBox34.isChecked()){
                    aTestWordsProvider.testWords[33].x = 1;
                } else{
                    aTestWordsProvider.testWords[33].x = 0;
                }
                if (checkBox35.isChecked()){
                    aTestWordsProvider.testWords[34].x = 1;
                } else{
                    aTestWordsProvider.testWords[34].x = 0;
                }

                if (checkBox36.isChecked()){
                    aTestWordsProvider.testWords[35].x = 1;
                } else{
                    aTestWordsProvider.testWords[35].x = 0;
                }
                if (checkBox37.isChecked()){
                    aTestWordsProvider.testWords[36].x = 1;
                } else{
                    aTestWordsProvider.testWords[36].x = 0;
                }
                if (checkBox38.isChecked()){
                    aTestWordsProvider.testWords[37].x = 1;
                } else{
                    aTestWordsProvider.testWords[37].x = 0;
                }
                if (checkBox39.isChecked()){
                    aTestWordsProvider.testWords[38].x = 1;
                } else{
                    aTestWordsProvider.testWords[38].x = 0;
                }
                if (checkBox40.isChecked()){
                    aTestWordsProvider.testWords[39].x = 1;
                } else{
                    aTestWordsProvider.testWords[39].x = 0;
                }


                if (checkBox41.isChecked()){
                    aTestWordsProvider.testWords[40].x = 1;
                } else{
                    aTestWordsProvider.testWords[40].x = 0;
                }
                if (checkBox42.isChecked()){
                    aTestWordsProvider.testWords[41].x = 1;
                } else{
                    aTestWordsProvider.testWords[41].x = 0;
                }
                if (checkBox43.isChecked()){
                    aTestWordsProvider.testWords[42].x = 1;
                } else{
                    aTestWordsProvider.testWords[42].x = 0;
                }
                if (checkBox44.isChecked()){
                    aTestWordsProvider.testWords[43].x = 1;
                } else{
                    aTestWordsProvider.testWords[43].x = 0;
                }
                if (checkBox45.isChecked()){
                    aTestWordsProvider.testWords[44].x = 1;
                } else{
                    aTestWordsProvider.testWords[44].x = 0;
                }

                if (checkBox46.isChecked()){
                    aTestWordsProvider.testWords[45].x = 1;
                } else{
                    aTestWordsProvider.testWords[45].x = 0;
                }
                if (checkBox47.isChecked()){
                    aTestWordsProvider.testWords[46].x = 1;
                } else{
                    aTestWordsProvider.testWords[46].x = 0;
                }
                if (checkBox48.isChecked()){
                    aTestWordsProvider.testWords[47].x = 1;
                } else{
                    aTestWordsProvider.testWords[47].x = 0;
                }
                if (checkBox49.isChecked()){
                    aTestWordsProvider.testWords[48].x = 1;
                } else{
                    aTestWordsProvider.testWords[48].x = 0;
                }
                if (checkBox50.isChecked()){
                    aTestWordsProvider.testWords[49].x = 1;
                } else{
                    aTestWordsProvider.testWords[49].x = 0;
                }

                WordsRecommender aWordsRecommender = new WordsRecommender(aWordsList, aTestWordsProvider);
                try {
                    FileOutputStream out = null;
                    out = openFileOutput("wordlist", Context.MODE_PRIVATE);
                    DataWriter.writeWordList(aWordsRecommender, out);
                }catch (Exception e){
                    e.printStackTrace();
                }


                Intent intent = new Intent(TestActivity.this, WordListActivity.class);
                startActivity(intent);
            }
        });
    }
}
