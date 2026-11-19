package LinkedList;

public class LMain {
     public static void main(String[] args) {
        LList list = new LList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
    }
}
