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

    void add(T val){

        Node node = new Node(val);

        if( head == null){
            head = temp = node;
            return;
        }

        temp.next = node;
        temp = node;
    }



}
