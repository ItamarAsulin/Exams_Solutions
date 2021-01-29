package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void swap() {
        MyLinkedList test = new MyLinkedList();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        test.add("e");
        test.add("f");
        System.out.println(test.toString());
        test.swap(1,5);
        System.out.println(test.toString());
    }
}