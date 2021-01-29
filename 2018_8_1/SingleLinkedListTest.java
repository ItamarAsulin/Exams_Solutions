package test;

import org.junit.jupiter.api.Test;
import test.SingleLinkedList;

class SingleLinkedListTest {

    @Test
    void addInPlaceTest() {
        SingleLinkedList ll = new SingleLinkedList();
        ll.addInPlace(3);
        ll.addInPlace(1);
        ll.addInPlace(6);
        ll.addInPlace(5);
        ll.addInPlace(2);
        ll.addInPlace(4);
        System.out.println(ll.toString());
    }
}