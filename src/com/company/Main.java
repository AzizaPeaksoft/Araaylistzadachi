package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            numbers.add(random.nextInt(50));

            if (i % 2 == 0){
                numbers2.add(i);
            }else {
                numbers3.add(i);
            }
        }
        System.out.println("сандар:" + numbers);
        System.out.println("жуп сандар: " + numbers2);
        System.out.println("так сандар: " + numbers3);
    }
}



