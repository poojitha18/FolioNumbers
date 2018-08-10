package com.company;

import java.io.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\nmalla\\Documents\\FolioNumbers\\input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while (!(line = br.readLine()).equals("END")) {
            if(line.equals("0")){

            }
            else{

            }
        }
    }
}
