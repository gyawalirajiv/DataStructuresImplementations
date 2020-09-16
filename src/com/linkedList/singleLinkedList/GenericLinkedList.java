package com.linkedList.singleLinkedList;

public class GenericLinkedList {
    private GenericSingleNode<Employee> head;
    private int size;

    public void addToFront(Employee e){
        GenericSingleNode<Employee> node = new GenericSingleNode<>(e);
        node.setNext(head);
        head = node;
        size++;
    }

    public GenericSingleNode<Employee> removeFromFront(){
        if(isEmpty()){
            return null;
        }
        size--;
        GenericSingleNode<Employee> node = head;
        head = head.getNext();
        return node;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        GenericSingleNode<Employee> node = head;
        while(node != null){
            System.out.println(node);
            node = node.getNext();
        }
    }

}
