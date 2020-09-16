package com.linkedList.singleLinkedList;

public class SingleLinkedListMain {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 6534);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        SingleLinkedList list = new SingleLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.insertSorted(new Employee("Derek", "Wilson", 100));
        System.out.println(list.getSize());
        list.printList();
    }
}
