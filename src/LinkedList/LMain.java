package LinkedList;

import org.w3c.dom.Node;

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
        list.insert(100,3);
        list.display();

         System.out.println("Removed element is: "+ list.deleteFirst());
         list.display();
         System.out.println("Removed item by delete last " + list.deleteLast());
         list.display();
         System.out.println("Removed item by index"+ list.deleteByIndex(2));
         list.display();

    }


}
