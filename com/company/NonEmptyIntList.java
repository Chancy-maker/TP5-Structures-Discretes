package com.company;

import java.util.LinkedList;
import java.util.Objects;

public class NonEmptyIntList implements IntList{

    /**
     * Tête de la liste
     */
    private int head;
    /**
     * Liste d'élément
     */
    private LinkedList<Integer> list;


    /**
     * Premier constructeur de la classe NonEmptyIntList
     * @param list
     * @param head
     */
    public NonEmptyIntList(LinkedList<Integer> list, int head){
        this.head = head;
        this.list=list;
        this.list.addFirst(head);
    }

    /**
     * Second constructeur de la classe NonEmptyIntList
     * @param list
     */
    public NonEmptyIntList(LinkedList<Integer> list){
        this.list=list;
    }

    /**
     * Acceur de la propriété list
     * @return
     */
    public LinkedList<Integer> getList(){
        return this.list;
    }

    /**
     * Permet d'ajouter un émélement à la première position de la list
     * @param element
     */
    public void addElementIntList(int element){
        this.list.addFirst(element);
    }




    @Override
    public int getHead() {
        return this.head;
    }

    @Override
    public IntList getTail() {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        IntList list2 = new NonEmptyIntList(list1);
        for (Integer lists : this.list){
            list1.add(lists);
        }
        list1.removeFirst();
        return list2;
    }

    @Override
    public boolean isEmpty() {
        if (this.list.size()==0){
            return true;
        }
        return false;
    }

    @Override
    public IntList cons(int n) {
        IntList intList1 = new NonEmptyIntList(this.list);
        addElementIntList(n);
        return intList1;
    }

    @Override
    public int length() {
       return this.list.size();
    }


    @Override
    public int sum(IntList intList){
        int result = 0;
        for (Integer ints : intList.getList()){
            result += ints;
        }
        return result;
    }

    public String toString(){
        String result = "[";
        for (Integer ints : this.list){
            result = result + ints + ", ";
        }
        result = result + "]";
        return result;
    }
}
