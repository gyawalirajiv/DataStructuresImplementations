package com.array;

public class DoubleDimensionalArray {

    int[][] arr = null;

    public DoubleDimensionalArray(int row, int col){
        this.arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                this.arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void traverseArray(){
        try{
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.println(arr[i][j]);
                }
            }
        } catch (NullPointerException e){
            System.out.println("Array not initialized!");
        }
        System.out.println("\n");
    }

    public void insertValueInTheArray(int row, int col, int element){
        try{
            arr[row][col] = element;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Location.");
        }
    }

    public void accessSingleCell(int row, int col){
        try{
            int value = arr[row][col];
            if(value == Integer.MIN_VALUE)
                throw new ArrayIndexOutOfBoundsException();
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such element;");
        }
    }

    public void searchingSingleValue(int value){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == value){
                    System.out.println("Value found! Index is: " + i + ", " + j);
                    return;
                }
            }
        }
        System.out.println("No such value present!");
    }

    public void deleteValuefromArray(int row, int col){
        try{
            arr[row][col] = Integer.MIN_VALUE;
        } catch (Exception e){
            System.out.println("No such Location");
        }
    }

    public void deleteThisArray(){
        this.arr = null;
    }
}
