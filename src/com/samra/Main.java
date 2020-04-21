package com.samra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** Array and Array list Lesson*/


        // Array
        //In Array you have to reference the index but not in ArrayList
        String[] num = {"one", "two", "three", "four", "five"};

        //For loop
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println(num.length);

        //ForEach
        for (String value : num) {
            System.out.println(value);
        }

        //ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println(numbers);
        //ArrayList size
        System.out.println(numbers.size());

        numbers.remove(1);

        System.out.println(numbers);

        System.out.println(numbers.get(0));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        for (Integer number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, 5);
        }

        System.out.println(numbers);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String w : words) {
            if (w.length() == len) count++;
        }
        System.out.println(count);
    }
    public boolean catDog(String str){
        int cat = 0;
        int dog = 0;
        for(int i = 0; i < str.length()-2; i++){
            if (str.substring(i, i + 3).equals("cat"))
                cat++;
        }
        if (str.substring(int, i + 3)).equals("dog"))
                dog++;
    }

}
