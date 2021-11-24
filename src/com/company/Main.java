package com.company;


import com.company.mylist.MyLinkedList;
import com.company.tests.TestClass;

public class Main {

    public static void main(String[] args) {
        //Тест методов MyLinkedList
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for(int i = 0;i<30;i++)
            myLinkedList.add(i);
        for (int num : myLinkedList)
            System.out.println(num);

        myLinkedList.set(0,-4);
        myLinkedList.set(10,-4);
        myLinkedList.set(myLinkedList.size()-1, -4);
        System.out.println("After set");
        myLinkedList.forEach(System.out::println);

        myLinkedList.remove(0);
        myLinkedList.remove(10);
        myLinkedList.remove(myLinkedList.size()-1);
        System.out.println("After remove");
        myLinkedList.forEach(System.out::println);

        System.out.println("Index of 30: " + myLinkedList.indexOf(30));
        System.out.println("Index of 7: " + myLinkedList.indexOf(7));
        Object[] arr = myLinkedList.toArray();
        for (Object element : arr)
            System.out.println(element);
        Integer[] intArr = new Integer[30];
        intArr = myLinkedList.toArray(intArr);
        for (int i=0;i<intArr.length;i++)
            System.out.println(intArr[i]);
        myLinkedList.clear();
        System.out.println("##############################\n");
        //#####################################################
        //Сравнение производительности

        TestClass testClass = new TestClass();
        long start;
        long finish;

        start  = System.nanoTime();
        testClass.testAddArrList();
        finish = System.nanoTime();
        System.out.println("AddArrList: " + (finish - start));

        start = System.nanoTime();
        testClass.testAddMList();
        finish = System.nanoTime();
        System.out.println("AddMyList: " + (finish - start));

        start = System.nanoTime();
        testClass.testAddList();
        finish = System.nanoTime();
        System.out.println("AddList: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testGetArrList();
        finish = System.nanoTime();
        System.out.println("GetArrList: " + (finish - start));

        start = System.nanoTime();
        testClass.testGetMList();
        finish = System.nanoTime();
        System.out.println("GetMyList: " + (finish - start));

        start = System.nanoTime();
        testClass.testGetList();
        finish = System.nanoTime();
        System.out.println("GetList: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testInsertArrayList();
        finish = System.nanoTime();
        System.out.println("InsertArrList: " + (finish - start));

        start = System.nanoTime();
        testClass.testInsertMList();
        finish = System.nanoTime();
        System.out.println("InsertMyList: " + (finish - start));

        start = System.nanoTime();
        testClass.testInsertList();
        finish = System.nanoTime();
        System.out.println("InsertList: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testSetArrList();
        finish = System.nanoTime();
        System.out.println("SetArrList: " + (finish - start));

        start = System.nanoTime();
        testClass.testSetMList();
        finish = System.nanoTime();
        System.out.println("SetMyList: " + (finish - start));

        start = System.nanoTime();
        testClass.testSetList();
        finish = System.nanoTime();
        System.out.println("SetList: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveArrList();
        finish = System.nanoTime();
        System.out.println("RemoveArrList: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveMList();
        finish = System.nanoTime();
        System.out.println("RemoveMyList: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveList();
        finish = System.nanoTime();
        System.out.println("RemoveList: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testAddHashSet();
        finish = System.nanoTime();
        System.out.println("AddHashSet: " + (finish - start));

        start = System.nanoTime();
        testClass.testAddLinkedHashSet();
        finish = System.nanoTime();
        System.out.println("AddLinkedHashSet: " + (finish - start));

        start = System.nanoTime();
        testClass.testAddTreeSet();
        finish = System.nanoTime();
        System.out.println("AddTreeSet: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveHashSet();
        finish = System.nanoTime();
        System.out.println("RemoveHashSet: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveLinkedHashSet();
        finish = System.nanoTime();
        System.out.println("RemoveLinkedHashSet: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveTreeSet();
        finish = System.nanoTime();
        System.out.println("RemoveTreeSet: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testPutHashMap();
        finish = System.nanoTime();
        System.out.println("PutHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testPutLinkedHashMap();
        finish = System.nanoTime();
        System.out.println("PutLinkedHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testPutTreeMap();
        finish = System.nanoTime();
        System.out.println("PutTreeMap: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveHashMap();
        finish = System.nanoTime();
        System.out.println("RemoveHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveLinkedHashMap();
        finish = System.nanoTime();
        System.out.println("RemoveLinkedHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testRemoveTreeMap();
        finish = System.nanoTime();
        System.out.println("RemoveTreeMap: " + (finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testGetHashMap();
        finish = System.nanoTime();
        System.out.println("GetHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testGetLinkedHashMap();
        finish = System.nanoTime();
        System.out.println("GetLinkedHashMap: " + (finish - start));

        start = System.nanoTime();
        testClass.testGetTreeMap();
        finish = System.nanoTime();
        System.out.println("GetTreeMap: " + (finish - start));

    }
}
