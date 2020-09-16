package com.linkedList.singleLinkedList;

public class SingleLinkedList {

    private SingleNode head;
    private int size;

    public void addToFront(Employee e){
        SingleNode node = new SingleNode(e);
        node.setNext(head);
        head = node;
        size++;
    }

    public SingleNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        size--;
        SingleNode node = head;
        head = head.getNext();
        return node;
    }

    public void insertSorted(Employee e){
        //assuming the list is sorted
        size++;
        SingleNode node = new SingleNode(e);
        if(isEmpty() || head.getEmployee().getId() > e.getId()){
            node.setNext(head);
            head = node;
            return;
        }
        SingleNode current = head;
        while(current.getNext() != null){
            if(e.getId() < current.getNext().getEmployee().getId()){
                SingleNode next = current.getNext();
                current.setNext(node);
                node.setNext(next);
                return;
            }
        }
        current.setNext(node);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        SingleNode node = head;
        while(node != null){
            System.out.println(node);
            node = node.getNext();
        }
    }

}
