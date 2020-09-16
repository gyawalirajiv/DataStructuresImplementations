package com.linkedList.doubleLinkedList;

import com.linkedList.singleLinkedList.Employee;
import com.linkedList.singleLinkedList.SingleNode;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleLinkedList() {
    }

    public void addToFront(Employee e){
        DoubleNode node = new DoubleNode(e);
        size++;
        if(!exists()){
            head = node;
            tail = node;
            return;
        }

        node.setNext(head);
        head.setPrev(node);
        head = node;
    }

    public void addToEnd(Employee e){
        DoubleNode node = new DoubleNode(e);
        size++;
        if(!exists()){
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){
        DoubleNode node = new DoubleNode(newEmployee);
        DoubleNode current = head;
        while (current != null && current.getNext() != null){
            if(current.getNext().getEmployee().equals(existingEmployee)){
                DoubleNode next = current.getNext();
                current.setNext(node);
                node.setPrev(current);
                node.setNext(next);
                next.setPrev(node);
                size++;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public DoubleNode removeFromFront(){
        if(!exists()) return null;

        size--;
        DoubleNode removingNode = head;
        if(head == tail){
            head = null;
            tail = null;
            return removingNode;
        }

        head = head.getNext();
        head.setPrev(null);
        removingNode.setNext(null);
        return removingNode;
    }

    public DoubleNode removeFromEnd(){
        if(!exists()) return null;

        DoubleNode removingNode = tail;
        size--;
        if(head == tail){
            head = null;
            tail = null;
            return removingNode;
        }

        tail = tail.getPrev();
        tail.setNext(null);
        removingNode.setPrev(null);
        return removingNode;

    }

    public boolean exists(){
        return head != null;
    }

    public void printList(){
        DoubleNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.printf("null\n");
    }

    public int getSize(){
        return size;
    }
}
