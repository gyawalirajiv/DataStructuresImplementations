package com.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = intArray[0];
            int largestIndex = 0;
            for (int j = 1; j < i; j++) {
                if(intArray[j] > largest){
                    largest = intArray[j];
                    largestIndex = j;
                }
            }

            if(largestIndex != i){
                int temp = intArray[largestIndex];
                intArray[largestIndex] = intArray[i];
                intArray[i] = temp;
            }

        }

        for (int i :
                intArray) {
            System.out.println(i);
        }
    }
}
