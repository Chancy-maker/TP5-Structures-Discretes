package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
	    IntList list1 = new NonEmptyIntList(list,4);
        list1.cons(3);
        list1.cons(2);
        list1.cons(1);
        System.out.println(list1);
        System.out.println(list1.length());
        System.out.println(list1.sum(list1));

    }
}
