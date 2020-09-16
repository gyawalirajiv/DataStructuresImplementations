package com.stack.stackLinkedList;

import com.linkedList.singleLinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StackLinkedList {

    private LinkedList<Employee> stack;

    public StackLinkedList() {
        stack = new LinkedList<>();
    }

    public void push(Employee e){
        stack.push(e);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> itr = stack.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("================");
    }


}
