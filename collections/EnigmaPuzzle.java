package com.github.ajwhiteh;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Scanner;

public class EnigmaPuzzle {
    private IntegerArray XY = new IntegerArray();
    private ArrayList<String> tempArray = new ArrayList<>();
    private ArrayList<char[]> puzzle = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private void initXY(){
        XY.add(sc.nextInt()); //y value at index 0
        XY.add(sc.nextInt()); //x value at index 1
    }

    public void printXY(){
        System.out.println("X = " + XY.at(1) + ". Y = " + XY.at(0) + ".");
    }

    public int getX(){
        return XY.at(1);
    }

    public int getY(){
        return XY.at(0);
    }

    private void initPuzzle(){
        for (int i = 0; i < XY.at(0); i++){
            tempArray.add(sc.nextLine());
        }
        for (int j = 0; j < XY.at(1); j++){
            puzzle.add(tempArray.get(j).toCharArray());
        }
    }

    public char getPuzzleChar(int x, int y){
        char[] temp = puzzle.get(y);
        return temp[x];
    }

    public void printPuzzle(){
        System.out.println("Puzzle:\n");
        for (int i = 0; i < XY.at(0); i++){
            char[] temp = puzzle.get(i);
            for (int j = 0; j < XY.at(1); j++){
                System.out.print(temp[j]);
            }
            System.out.print("\n");
        }
    }

    public void init(){
        initXY();
        initPuzzle();
    }
}
