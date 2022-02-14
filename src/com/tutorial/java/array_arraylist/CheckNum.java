package com.tutorial.java.array_arraylist;

import java.util.Arrays;

public class CheckNum {


        public static void main(String[] args) {

            Integer arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
            int toCheckValue = 7;

            System.out.println("Array: " + Arrays.toString(arr));

            check(arr, toCheckValue);

        }

    private static void check(Integer[] arr, int toCheckValue) {

        boolean test = Arrays.asList(arr).contains(toCheckValue);
        System.out.println("Is " + toCheckValue + " present in the array: " + test);

    }
}
