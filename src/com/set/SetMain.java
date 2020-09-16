package com.set;

import com.linkedList.singleLinkedList.Employee;

public class SetMain {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee janeJones2 = new Employee("Jane", "Jones", 123);

        Set set = new Set();
        set.add(janeJones);
        set.add(johnDoe);
        set.add(marySmith);
        set.add(marySmith);
        set.add(janeJones2);

        set.printSet();

        set.remove(marySmith);
        set.printSet();


    }
}
