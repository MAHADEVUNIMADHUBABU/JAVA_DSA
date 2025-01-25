package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkyList list = new LinkyList();

        for(int i = 0 ; i < 10 ; i++) list.add(i+1);

        while (!list.isEmpty()) System.out.println(list.removeFirst());
    }
}
