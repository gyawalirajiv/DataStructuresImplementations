package com.linkedList.doubleLinkedList;

import com.linkedList.singleLinkedList.Employee;

public class DoubleNode {
    private Employee employee;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public String toString(){
        return employee.toString();
    }
}
