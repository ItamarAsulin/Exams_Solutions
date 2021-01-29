package test;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLinkedList {
    private MyNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public MyNode getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

    public void add(int data) {
        if (head == null) {
            head = new MyNode(data);
        } else {
            MyNode n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(new MyNode(data));
        }
        size++;
    }

    public String toString() {
        String ans = "[";
        if (head == null) ans = "[]";
        else {
            MyNode n = head;
            while (n.getNext() != null) {
                ans = ans + n.getData() + ", ";
                n = n.getNext();
            }
            ans = ans + n.getData() + "]";
        }
        return ans;
    }

    public MyNode getLast() {
        if (head.getNext() == null)
            return null;
        if (head == null)
            return null;
        else {
            MyNode p = this.head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            return p;
        }

    }

    public static MyNode cycle(MyNode p) {
        if (p.getNext() != null) {
            Set<MyNode> a = new HashSet<>();
            MyNode temp = p;
            int currentSize = 0;
            while (temp.getNext() != null) {
                a.add(temp);
                currentSize++;
                if (currentSize != a.size())
                    return temp;
                temp = temp.getNext();
            }

        }
        return null;

    }

    public static void main(String[] args) {


        MyLinkedList ll = new MyLinkedList();
        ll.add(-2);
        ll.add(3);
        ll.add(100);
        ll.add(9);
        ll.add(-30);
        MyNode p1 = ll.getLast();
        System.out.println(p1);
        ll.add(11);
        ll.add(5);
        ll.add(3);
        MyNode p2 = ll.getLast();
        System.out.println(p2);
        p2.setNext(p1);
        System.out.println(p2.getNext().toString());
        MyNode p3 = cycle(ll.getHead());
        System.out.println(p3);
    }
}
