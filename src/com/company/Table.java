package com.company;

import java.util.*;

public class Table {

    ArrayList<Record> records = new ArrayList<Record>();
    String title;

    Table(ArrayList<String> testCase){
        this.title = testCase.get(0);
        for(int i=1;i<testCase.size();i++){
            String temp[] = testCase.get(i).split(" ");
            Range range = new Range(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
            Record rec = new Record(range,temp[2].charAt(0),Integer.parseInt(temp[3]));
            records.add(rec);
        }
    }



}
