package com.github.ajwhiteh;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
    }

    @Test
    public void outputMessage() {
        System.out.println("ouputMessage");
        Main instance = new Main();
        String expResult = "1 Abracadabra";
        String result = instance.inputOut;
        assertEquals(expResult, result);
    }

    @Test
    public void initInput() {
        System.out.println("setMessage\nEnter: 5");
        Main instance = new Main();
        instance.initInput();
        int expResult = 5;
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        assertEquals(expResult, result);
    }

    @Test
    public void createMessage() {
        System.out.println("createMessage");
        Main instance = new Main();
        int num = 2;
        String expResult = "1 Abracadabra\n2 Abracadabra";
        instance.inputIn = 2;
        instance.createMessage();
        String result = instance.inputOut;
        assertEquals(expResult, result);
    }
}