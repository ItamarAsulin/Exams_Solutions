package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void sortTest() {
        MyLinkedList ll = new MyLinkedList();
        ll.add(6);
        ll.add(3);
        ll.add(2);
        ll.add(24);
        ll.add(6);
        ll.add(8);
        ll.add(4);
        ll.add(94);
        ll.add(104);
        ll.add(36);
        ll.add(625);
        ll.sort();
        System.out.println(ll.toString());
    }
}