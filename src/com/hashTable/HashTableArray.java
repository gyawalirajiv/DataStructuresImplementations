package com.hashTable;

import com.linkedList.singleLinkedList.Employee;

public class HashTableArray {

    Employee[] hashtable;

    public HashTableArray() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee e){
        int hash = hashKey(key);
        if(hashtable[hash] != null){
            System.out.println("This slot is already occupied!");
            return;
        }
        hashtable[hash] = e;
    }

    public Employee get(String key){
        return hashtable[hashKey(key)];
    }

    public int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i = 0; i < hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
        System.out.println("================");
    }
}
