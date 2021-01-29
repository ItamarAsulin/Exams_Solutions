package test;

import test.Node;

public class SingleLinkedList {
    private Node head;
    private int size;
    public SingleLinkedList() {
        head = null;
        size = 0;
    }
    public String toString() {
        if(head == null)
            return "[]";
        String res = "[";
        Node pointer = head;
        while(pointer.next != null)
        {
            res = res + pointer.toString()+", ";
            pointer = pointer.next;
        }
        res = res + pointer.toString();
        return res + "]";
    }
    public void add(int a){
        if(head == null){
            this.head = new Node(a);
        }
        if(this.head.next == null){
            this.head.next = new Node(a);
        }
        else{
            Node p = this.head;
            while(p.next != null){
                p=p.next;
            }
            p.next = new Node(a);
        }
        size++;
    }
    public void addInPlace(int num){
        if(this.head == null){
            this.head = new Node(num);
        }
        else if(num < this.head.data){
            Node p = this.head;
            this.head = new Node(num);
            this.head.next =p;
        }else{
            Node p = this.head;
            while(p.next != null && p.next.data < num){
                p = p.next;
            }
            Node temp = p.next;
            p.next = new Node(num);
            p.next.next = temp;

        }
        size ++;
    }

}
