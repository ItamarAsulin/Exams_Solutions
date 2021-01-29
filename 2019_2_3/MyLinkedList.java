package test;

import java.util.ArrayList;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);
        }
        size++;
    }

    public String toString() {
        String ans = "[";
        if (head == null) ans = "[]";
        else {
            Node n = head;
            while (n.next != null) {
                ans = ans + n + ", ";
                n = n.next;
            }
            ans = ans + n + "]";
        }
        return ans;
    }

    public boolean remove() {
        if (head == null) {
            return false;
        }
        if (size == 1) {
            this.head = null;
            return true;
        } else {
            Node current = this.head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.next = null;
            size--;
            return true;
        }
    }

    public boolean invert() {
        if (size == 0) {
            return false;
        } else if (size == 1) {
            return true;
        } else {
            ArrayList<Node> ll = new ArrayList<>();
            Node temp = this.head;
            for (int i = 0; i <this.size ; i++) {
                ll.add(temp);
                temp = temp.next;

            }

            MyLinkedList invertedList = new MyLinkedList();
            for (int i = ll.size() -1; i >=0 ; i--) {
                Node p2 = ll.get(i);
                invertedList.add(p2.getData());
            }
            this.head = invertedList.head;
            return true;
        }

    }


    }


