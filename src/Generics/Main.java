package Generics;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        while (list.isEmpty() == false) System.out.println(list.removeHead());
    }
}
