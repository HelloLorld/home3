package com.company.tests;


//Класс чтобы была возможность вывести измерения без подписей (для записи в таблицу)
public class Other {
    public static void main(String[] args) {
        // write your code here
        TestClass testClass = new TestClass();
        long start;
        long finish;

        start  = System.nanoTime();
        testClass.testAddArrList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testAddMList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testAddList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testGetArrList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testGetMList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testGetList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testInsertArrayList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testInsertMList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testInsertList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testSetArrList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testSetMList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testSetList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveArrList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveMList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveList();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testAddHashSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testAddLinkedHashSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testAddTreeSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveHashSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveLinkedHashSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveTreeSet();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testPutHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testPutLinkedHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testPutTreeMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testRemoveHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveLinkedHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testRemoveTreeMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        //##################################################
        System.out.println();

        start  = System.nanoTime();
        testClass.testGetHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testGetLinkedHashMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

        start = System.nanoTime();
        testClass.testGetTreeMap();
        finish = System.nanoTime();
        System.out.println((finish - start));

    }
}
