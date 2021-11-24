package com.company.tests;

import com.company.mylist.MyLinkedList;

import java.util.*;

public class TestClass {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private LinkedList<Integer> list = new LinkedList<>();
    private MyLinkedList<Integer> myList = new MyLinkedList<>();

    private HashSet<Integer> hashSet = new HashSet<>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Integer> treeSet = new TreeSet<>();

    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    private LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Integer,Integer> treeMap = new TreeMap<>();

    //Тест MyLinkedList
    public void testAddMList() {
        for(int i = 0;i<10000;i++)
            myList.add(i);
    }

    public void testRemoveMList() {
        for(int i = 0;i<150;i++)
            myList.remove(i*50);
    }

    public void testGetMList() {
        for(int i = 0; i < 340;i++)
            myList.get(i*25);
    }

    public void testSetMList() {
        for (int i = 0; i < 150;i++)
            myList.set(i*50,i*50);
    }

    public void testInsertMList() {
        for (int i = 0;i<150;i++)
            myList.add(i,i);
    }

    //#############################
    //Тест LinkedList

    public void testAddList() {
        for(int i = 0;i<10000;i++)
            list.add(i);
    }

    public void testRemoveList() {
        for(int i = 0;i<150;i++)
            list.remove(i*50);
    }

    public void testGetList() {
        for(int i = 0; i < 340;i++)
            list.get(i*25);
    }

    public void testSetList() {
        for (int i = 0; i < 150;i++)
            list.set(i*50,i*50);
    }

    public void testInsertList() {
        for (int i = 0;i<150;i++)
            list.add(i,i);
    }

    //#############################
    //Тест ArrayList

    public void testAddArrList() {
        for(int i = 0;i<10000;i++)
            arrayList.add(i);
    }

    public void testRemoveArrList() {
        for(int i = 0;i<150;i++)
            arrayList.remove(i*50);
    }

    public void testGetArrList() {
        for(int i = 0; i < 340;i++)
            arrayList.get(i*25);
    }

    public void testSetArrList() {
        for (int i = 0; i < 150;i++)
            arrayList.set(i*50,i*50);
    }

    public void testInsertArrayList() {
        for (int i = 0;i<150;i++)
            arrayList.add(i,i);
    }

    //#############################
    //Тест HashSet

    public void testAddHashSet() {
        for(int i = 0;i<10000;i++)
            hashSet.add(i);
    }

    public void testRemoveHashSet() {
        for(int i = 0;i<150;i++)
            hashSet.remove(i*50);
    }

    //#############################
    //Тест LinkedHashSet

    public void testAddLinkedHashSet() {
        for(int i = 0;i<10000;i++)
            linkedHashSet.add(i);
    }

    public void testRemoveLinkedHashSet() {
        for(int i = 0;i<150;i++)
            linkedHashSet.remove(i*50);
    }

    //#############################
    //Тест TreeSet

    public void testAddTreeSet() {
        for(int i = 0;i<10000;i++)
            treeSet.add(i);
    }

    public void testRemoveTreeSet() {
        for(int i = 0;i<150;i++)
            treeSet.remove(i*50);
    }

    //#############################
    //Тест HashMap

    public void testPutHashMap() {
        for(int i = 0;i<10000;i++)
            hashMap.put(i,i);
    }

    public void testGetHashMap() {
        for(int i = 0; i < 340;i++)
            hashMap.get(i*25);
    }

    public void testRemoveHashMap() {
        for(int i = 0;i<150;i++)
            hashMap.remove(i*50);
    }

    //#############################
    //Тест LinkedHashMap

    public void testPutLinkedHashMap() {
        for(int i = 0;i<10000;i++)
            linkedHashMap.put(i,i);
    }

    public void testGetLinkedHashMap() {
        for(int i = 0; i < 340;i++)
           linkedHashMap.get(i*25);
    }

    public void testRemoveLinkedHashMap() {
        for(int i = 0;i<150;i++)
            linkedHashMap.remove(i*50);
    }

    //#############################
    //Тест TreeMap

    public void testPutTreeMap() {
        for(int i = 0;i<10000;i++)
            treeMap.put(i,i);
    }

    public void testGetTreeMap() {
        for(int i = 0; i < 340;i++)
            treeMap.get(i*25);
    }

    public void testRemoveTreeMap() {
        for(int i = 0;i<150;i++)
            treeMap.remove(i*50);
    }
}
