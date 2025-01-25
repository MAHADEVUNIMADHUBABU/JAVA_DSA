package LinkedList;

public class LinkyList {

    private class Node{
        private int val;
        Node next;
        Node(int v){
            val = v;
        }
    }

    private Node head , temp;

    void add(int val){

        Node node = new Node(val);

        if( head == null){
            head = temp = node;
            return;
        }

        temp.next = node;
        temp = node;
    }

    int removeFirst(){

        if(isEmpty()) throw new NullPointerException();

        Node node = head;
        head = head.next;
        return node.val;
    }

    boolean isEmpty(){
        return head == null;
    }
}
