package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void invertTest() {
        MyLinkedList ll = new MyLinkedList();
        ll.add("2");
        ll.add("5");
        ll.add("1");
        ll.add("45");
        ll.add("4");
        System.out.println(ll.toString());
        ll.invert();
        System.out.println(ll.toString());
    }
}