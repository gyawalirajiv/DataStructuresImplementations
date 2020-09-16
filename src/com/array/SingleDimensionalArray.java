package com.array;

public class SingleDimensionalArray {

    int[] arr = null;

    public SingleDimensionalArray(int sizeOfArray){
        this.arr = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            this.arr[i] = Integer.MIN_VALUE;
        }
    }

    public void traverseArray(){
        try{
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        } catch (NullPointerException e){
            System.out.println("Array not initialized!");
        }
    }

    public void insert(int location, int element){
        try{
            arr[location] = element;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Location.");
        }
    }

    public void accessingCell(int location){
        try{
            int value = arr[location];
            if(value == Integer.MIN_VALUE)
                throw new ArrayIndexOutOfBoundsException();
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such element;");
        }
    }

    public void searchInAnArray(int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                System.out.println("Value found! Index is: " + i);
                return;
            }
        }
        System.out.println("No such value present!");
    }

    public void deleteValueFromArray(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
        } catch (Exception e){
            System.out.println("No such Location");
        }
    }

    public void deleteThisArray(){
        this.arr = null;
    }
}
