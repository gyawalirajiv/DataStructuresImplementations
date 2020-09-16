package com.hashTable;

import com.linkedList.singleLinkedList.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashTableChained {

    LinkedList<StoredEmployee>[] hashTable;

    public HashTableChained() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee e){
        hashTable[hashKey(key)].push(new StoredEmployee(key, e));
    }

    public Employee get(String key){
        LinkedList<StoredEmployee> list = hashTable[hashKey(key)];
        ListIterator<StoredEmployee> itr = list.listIterator();
        while (itr.hasNext()){
            StoredEmployee se = itr.next();
            if(se.key.equals(key)){
                return se.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        LinkedList<StoredEmployee> list = hashTable[hashKey(key)];
        ListIterator<StoredEmployee> itr = list.listIterator();
        int index = 0;
        while(itr.hasNext()){
            StoredEmployee se = itr.next();
            if(se.key.equals(key)){
                Employee e = se.employee;
                list.remove(index);
                return e;
            }
            index++;
        }
        return null;
    }

    public int hashKey(String key){
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashtable(){
        for(int i = 0; i < hashTable.length; i++){
            LinkedList<StoredEmployee> list = hashTable[i];
            Iterator<StoredEmployee> itr = list.listIterator();
            while (itr.hasNext()){
                StoredEmployee se = itr.next();
                System.out.println("KEY: " + se.key + " VALUE: " + se.employee);
            }
        }
        System.out.println("==============");
    }
}
