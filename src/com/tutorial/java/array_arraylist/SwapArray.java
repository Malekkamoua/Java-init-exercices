package com.tutorial.java.array_arraylist;

import java.util.Arrays;
import java.util.Random;

public class SwapArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        swapArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void swapArray(int array[]) {
        for(int i = array.length - 1 ; i >=1; i--) {
            Random rand = new Random();
            int j = rand.nextInt(i+1);
            swap_elements(array, i, j);
        }
    }

    public static void swap_elements (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
