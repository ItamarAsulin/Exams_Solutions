package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void removeDup() {
        MyLinkedList test = new MyLinkedList();
        test.add(1);
        test.add(6);
        test.add(2);
        test.add(3);
        test.add(6);
        test.add(1);
        test.add(1);
        test.add(4);
        test.add(9);
        test.add(4);
        test.removeDup();
        System.out.println(test.toString());
    }
}