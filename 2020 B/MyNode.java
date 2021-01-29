package test;

import java.util.HashSet;
import java.util.Set;

public class MyNode {
    private int data;
    private MyNode next;
    public MyNode(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }



    public String toString(){
        return "this data: " + this.data;
    }

//    public static void main(String[] args) {
//        MyLinkedList ll = new MyLinkedList();
//        ll.add(-2);
//        ll.add(3);
//        ll.add(100);
//        ll.add(9);
//        ll.add(-30);
//        MyNode p1 = ll.getLast();
//        System.out.println(p1);
//        ll.add(11);
//        ll.add(5);
//        ll.add(3);
//        MyNode p2 = ll.getLast();
//        System.out.println(p2);
//        p2.setNext(p1);
//        System.out.println(ll.getHead());
//    }
    //Node p1 = ll.getLast();
    //        ll.add(11);
    //        ll.add(5);
    //        ll.add(3);
    //        Node p2 = ll.getLast();
    //        p2.setNext(p1);
    //        assertEquals(p1, );
}
