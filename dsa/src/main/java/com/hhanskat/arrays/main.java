package com.hhanskat.arrays;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        // test array class here
        System.out.println("Hello World, this is an array");
        
        // og arraylist for comparison
        ArrayList<Integer> ogArray = new ArrayList<Integer>();
        
        
        myArray<String> arr = new myArray<String>();

        // size
        System.out.println(".size()");
        System.out.println(arr.size());
        
        // isEmpty
        System.out.println(".isEmpty()");
        System.out.println(arr.isEmpty());
        
        // set
        System.out.println(".set(2, 'hello')");
        arr.set(2, "Hello");
        
        // get
        System.out.println(".get(2)");
        System.out.println(arr.get(2));

        // clear
        System.out.println(".clear()");
        arr.clear();
        System.out.println(arr);

        // add
        System.out.println(".add()");
        arr.add("Adding a value");
        arr.add("A second value");
        arr.add("and another one");
        arr.add("Hello");
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));

        // remove At
        System.out.println(".removeAt(1)");
        arr.removeAt(1);
        System.out.println(arr.get(1));

        // indexOf
        System.out.println(".indexOf('hello')");
        arr.indexOf("Hello");

        // contains
        System.out.println(".contains()");
        arr.contains("Hello");

        // toString
        System.out.println(".toString()");
        arr.toString();

        /*TODO: Use TDD instead of this main class to test if the functions I'm writing actually work.
        */

    } 

}
