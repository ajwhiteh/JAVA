package com.github.ajwhiteh;

import java.util.ArrayList;
import java.util.Scanner;

public class EnigmaWords {

    private int numWords;
    private ArrayList<String> words = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private void initNumWords() {
        numWords = sc.nextInt();
    }

    public int getNumWords() {
        return numWords;
    }

    private void initWords(){
        for (int i = 0; i < numWords; i++){
            words.add(sc.nextLine());
        }
    }

    public String getWord(int i){
        return words.get(i);
    }

    public void printWords() {
        for (int i = 0; i < numWords; i++){
            System.out.println(words.get(i));
        }
    }

    public void init(){
        initNumWords();
        initWords();
    }
}
