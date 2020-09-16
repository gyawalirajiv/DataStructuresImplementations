package com.queue;

import com.linkedList.singleLinkedList.Employee;

public class QueueArray {

    private Employee[] queue;
    private int front;
    private int back;

    public QueueArray(int size) {
        queue = new Employee[size];
    }

    public void add(Employee e){
        if(queue.length == back){
            Employee[] tempArr = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, tempArr, 0, queue.length);
            queue = tempArr;
        }
        queue[back++] = e;
    }

    public Employee remove(){
        if(front == back) return null;
        Employee e = queue[front];
        queue[front] = null;
        front++;
        if(front == back){
            front = back = 0;
        }
        return e;
    }

    public Employee peek(){
        if(front == back) return null;
        return queue[front];
    }

    public void printQueue(){
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
        System.out.println("===============");
    }
}
