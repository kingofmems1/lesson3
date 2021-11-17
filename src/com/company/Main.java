package com.company;

public class Main {


    public static void main(String[] args) {

        //create a dynamic array (list)
        String[] array = {"word", "word2", "word3"};
        System.out.println(array[1]);

        //create a fixed array (list)
        int[] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        System.out.println(array2[2]);

        //i++ = i+1
        //cycle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }

        //getting all indices from array list
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //cycle while
        int count = 0;
        while (count <= 10) {
            System.out.println("our number: " + count);
            count++;
        }

        //cycle do...while
        int count2 = 0;
        do {
            count2++;
            System.out.println(count2);
        } while (count2 < 5);

        System.out.println("===================");

        //cycle foreach
        for (int value : array2) {
            System.out.println("Number: " + value);
        }

        //example of using break
        for (int val : array2) {
            System.out.println("num: " + val);
            if (val == 1) break;
        }

        //example of using continue
        for (int value : array2) {
            if (value == 2) continue;
            System.out.println("num: " + value);
        }

    }
}
