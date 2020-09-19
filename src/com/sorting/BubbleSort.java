package com.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = intArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(intArray[j] > intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

        for (int i :
                intArray) {
            System.out.println(i);
        }
    }
}
