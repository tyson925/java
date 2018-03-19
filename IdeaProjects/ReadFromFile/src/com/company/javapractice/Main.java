package com.company.javapractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.readFile("/home/laszlobalint/IdeaProjects/ReadFromFile/src/com/company/javapractice/file.txt");
        main.writeContentToFile("file_2.txt", "Yolo");
        System.out.println(main.readFile("./file_2.txt"));
    }

    public String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new java.io.File(fileName)));
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeContentToFile(String fileName, String content) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(content);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
