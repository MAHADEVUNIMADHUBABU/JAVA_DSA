package Generics;

import LinkedList.Main;

public class LinkList<T>{

    private class Node {
        T val;
        Node next;
        Node(T v){
            val = v;
        }
    }

    private Node head, temp;
    private int size = 0;

    void add(T val){

        Node node = new Node(val);

        if( head == null){
            head = temp = node;
            size++;
            return;
        }

        size++;
        temp.next = node;
        temp = node;
    }

    T get(int ind){

        if( ind >= size) throw new IndexOutOfBoundsException();

        Node curr = head;

        for (int i = 0; i < size; i++) {
            curr = curr.next;
        }

        return (T)curr.val;
    }

    boolean isEmpty(){
        return size == 0;
    }

    T removeHead(){

        if (isEmpty()) throw new NullPointerException();

        Node curr = head;
        head = head.next;
        size--;

        return (T)curr.val;
    }
}
