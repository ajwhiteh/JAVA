package com.github.ajwhiteh;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main timeLoop = new Main();
        timeLoop.initInput();
        timeLoop.outputMessage();
    }

    public int inputIn;
    public String inputOut = "";

    public void outputMessage(){
        System.out.print(inputOut);
    }

    public void initInput(){
        Scanner sc = new Scanner(System.in);
        inputIn = sc.nextInt();
        createMessage();
    }

    public void createMessage(){
        for (int i = 1; i <= inputIn; i++){
            inputOut += (i + " Abracadabra\n");
        }
    }
}
