package Array_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(20);
        System.out.println(arr);
        System.out.println("Length of arr is " + arr.size());
        // Accessing element
        System.out.println(arr.get(0));
        System.out.println(arr.get(2));
        System.out.println("Before change element the arr is " + arr);
        arr.set(2, 100);
        System.out.println("Before change element the arr is " + arr);
        arr.remove(1);
        System.out.println("After remove " + arr);
//      traversing through array list

//        for(int item : arr){
//            System.out.println(item);
//        }
//
//        System.out.println("element through for each");
//        arr.forEach(item-> System.out.println(item));

        //checking element
        System.out.println("Is it contain 12 " + arr.contains(12));
        // Find the index
        System.out.println("Index of 12 is " + arr.indexOf(12));

        ArrayList<String> newArr = new ArrayList<>();

        System.out.println("Is a arraylist is empty " + newArr.isEmpty());

//        clear an  arraylist
        arr.clear();


        // convert a arraylist or collection to an object
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Object[] array = list.toArray();

        for (Object item : array) {
            System.out.println(item);
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        // Display ArrayList
        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
        /*
        Method          Comment / Purpose
        add()           Add an element
        get()           Access an element
        set()           Update an element
        remove()         Remove an element
        size()          Get the number of elements
        contains()       Check if an element exists
        indexOf()       Find the first index
        lastIndexOf()

Find the last index

clear()

Remove all elements

isEmpty()

Check if the list is empty

sort()

Sort elements

toArray()

Convert ArrayList into an array
         */

    }
}
