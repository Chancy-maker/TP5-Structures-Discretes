package com.company;

import java.util.LinkedList;

public class EmptyInList implements IntList{

    /**
     * List des élément
     */
    private LinkedList<Integer> list;

    /**
     * Constructeur de la classe EmptyList
     */
    public EmptyInList(){
        this.list = new LinkedList<>();
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
        return 0;
    }

    @Override
    public IntList getTail() {
        return null;
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

    @Override
    public LinkedList<Integer> getList() {
        return this.getList();
    }
}
