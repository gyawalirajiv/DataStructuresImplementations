package com.set;

import com.linkedList.singleLinkedList.Employee;

import java.util.HashMap;

public class Set {

    private HashMap<Employee, Object> map;
    private final Object DUMMY = new Object();

    public Set() {
        this.map = new HashMap<>();
    }

    public void add(Employee e){
        map.put(e, DUMMY);
    }

    public void remove(Employee e){
        map.remove(e);
    }

    public void printSet(){
        map.forEach((employee, o) -> {
            System.out.println(employee);
        });
        System.out.println("==============");
    }
}
