package test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void swap() {
        MyLinkedList ll = new MyLinkedList();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        ll.add("f");
        System.out.println(ll.toString());
        ll.swap(1,5);
        System.out.println(ll.toString());
    }
    @Test
    void reverseTest() {
        MyLinkedList ll = new MyLinkedList();
        ll.add("a");
        ll.add("bcsfg");
        ll.add("casfgf");
        ll.add("ds");
        ll.add("ehdfgherw");
        ll.add("dddf");
        System.out.println(ll.toString());
        ll.sort();
        System.out.println(ll.toString());
//        System.out.println(ll.toString());
//        ll.reverse();
//        System.out.println(ll.toString());
//        System.out.println(ll.size);
//        System.out.println(ll.getNodeAt(7));
//        ll.addAt("a",0);
//        System.out.println(ll.toString());
//        ll.addAt("c", 3);
//        System.out.println(ll.toString());

    }
}