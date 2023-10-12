package collectionpackage;

import com.sun.jdi.IntegerType;

import java.util.LinkedList;

public class LinkedListclass {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList <Integer> l1 = new LinkedList<Integer>();
        LinkedList<String> l2= new LinkedList<String>();
        l.add(100);
        l.add("a");
        l.add(10.0);
        l.add(null);
        l.add(true);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(3,"ja");
        System.out.println(l);
//get(),set,isEmpty()
        l.addFirst("S");
        System.out.println(l);
        System.out.println(l.getFirst());
//addLast,getLast, removeFirst, removeLast

    }
}
