package LinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        for(int i = 0 ; i < 10 ; i++) list.add(i+1);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
