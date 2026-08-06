package singleArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);
        list.add(29);
        list.add(23);
        list2.addAll(list);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
        System.out.println(list.contains(23));
        System.out.println(list.indexOf(25));
        System.out.println(list.lastIndexOf(23));

    }
}
