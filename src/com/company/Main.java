package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        ArrayList<Integer> numbers1 = (ArrayList<Integer>) numbers.clone();
        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println(numbers1.get(i));
        }
    }
}
