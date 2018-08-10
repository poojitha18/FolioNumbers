package com.company;

import java.io.*;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        ArrayList<Table> testCases = new ArrayList<>();

        ArrayList<String> tempSet = new ArrayList<>();
        while (!(line = br.readLine()).equals("END")) {
            if(line.equals("0")){
                testCases.add(new Table(tempSet));
                tempSet.clear();
            }
            else{
                tempSet.add(line);
            }
        }
    }
}
