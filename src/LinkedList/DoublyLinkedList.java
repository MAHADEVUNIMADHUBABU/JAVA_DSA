package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private class Node{
        int val;
        Node next;
        Node prev;
        Node(int v){
            val = v;
        }
    }

    private Node head, temp , tail , tailtemp;
    private int size;

    void add(int val){

        Node node = new Node(val);

        if(head == null){
            head = temp = tail = tailtemp = node;
            size++;
            return;
        }

        temp.next = tailtemp = node;
        tailtemp.prev = temp;
        temp = temp.next;
        tail = node;
        size++;
    }

    int getLast(){

        if (isEmpty()) throw new NoSuchElementException();
        return tail.val;
    }

    int getFirst(){

        if (isEmpty()) throw new NoSuchElementException();
        return head.val;
    }

    boolean isEmpty(){
        return size == 0;
    }
}
