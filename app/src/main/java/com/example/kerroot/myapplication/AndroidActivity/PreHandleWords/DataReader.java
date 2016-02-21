package com.example.kerroot.myapplication.AndroidActivity.PreHandleWords;

/**
 * Created by ker root on 2016/2/19.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DataReader {

    //PC
    public static String readWordsList() throws IOException{
        String path = "c://TestFindKeyWords//cet6words2.txt";
        return getFileContent(path);
    }

    public static String readData() throws IOException{
        String path = "c://TestFindKeyWords//data.txt";
        return getFileContent(path);
    }

    public static String readExamsData() throws IOException{
        String path = "c://TestFindKeyWords//exams_data//";
        String content = "";
        File file = new File(path);
        File[] tempList = file.listFiles();
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile())
                content += getFileContent(tempList[i].getPath());
        }
        return content;
    }

    public static int getExamsDataNum() throws IOException{

        String path = "c://TestFindKeyWords//exams_data//";
        File file = new File(path);
        File[] tempList = file.listFiles();
        return tempList.length;
    }

    public static String getFileContent(String fileName) throws IOException {

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        return getContent(reader);
    }

    //Phone
    public static String getInputStreamContent(InputStream inputStream) throws IOException{

        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return getContent(reader);
    }

    public static String getContent( BufferedReader reader) throws IOException {

        String line = "";
        StringBuffer aStringBuffer = new StringBuffer("");
        while ((line = reader.readLine()) != null) {
            aStringBuffer.append(line);
            aStringBuffer.append("\n");
        }
        reader.close();
        return aStringBuffer.toString();
    }
}

