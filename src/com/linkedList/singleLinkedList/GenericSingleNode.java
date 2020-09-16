package com.linkedList.singleLinkedList;

public class GenericSingleNode<T> {
    private T data;
    private GenericSingleNode<T> next;

    public GenericSingleNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setdata(T data) {
        this.data = data;
    }

    public GenericSingleNode<T> getNext() {
        return next;
    }

    public void setNext(GenericSingleNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GenericSingleNode{" +
                "data=" + data +
                '}';
    }
}
