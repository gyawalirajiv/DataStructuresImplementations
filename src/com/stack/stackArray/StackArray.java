package com.stack.stackArray;

import com.linkedList.singleLinkedList.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackArray {

    private Employee[] stack;
    private int top;

    public StackArray(int size) {
        stack = new Employee[size];
    }

    public void push(Employee e){
        if(top == stack.length){
            Employee[] tempArr = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, tempArr, 0, stack.length);
            stack = tempArr;
        }

        stack[top] = e;
        top++;
    }

    public Employee pop(){
        if(top == 0) throw new EmptyStackException();

        Employee e = stack[top - 1];
        stack[top - 1] = null;
        top--;
        return e;
    }

    public Employee peek(){
        if(top == 0) throw new EmptyStackException();
        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("================");
    }


}
