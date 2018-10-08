package com.github.ajwhiteh;

/*
Enigma:

Main class handles the information collected by "EnigmaCollection" class
 */
public class Main {

    public static void main(String[] args) {
        Main Enigma = new Main();
	    Enigma.initCollection();
    }

    static EnigmaPuzzle crossword = new EnigmaPuzzle();
    static EnigmaWords wordList = new EnigmaWords();

    public void initCollection() {
        crossword.init();
        wordList.init();
    }


}

