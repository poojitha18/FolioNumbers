package com.company;

import java.io.*;
import java.util.*;

public class Table {

    ArrayList<Record> records = new ArrayList<Record>();
    String title;

    Table(ArrayList<String> testCase){
        this.title = testCase.get(0);
        for(int i=1;i<testCase.size();i++){
            //call addRecord function
        }
    }



}
