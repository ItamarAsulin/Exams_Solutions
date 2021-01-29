package test;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;

public class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
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
                ans = ans + n.data + ", ";
                n = n.next;
            }
            ans = ans + n.data + "]";
        }
        return ans;
    }

    public void reverse() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        Node p = new Node(this.head.data);
        this.head = this.head.next;
        reverse();
        this.add(p.data);
        size --;

    }

    public boolean swap(int i, int j) {
        if (this.head == null || j < 0 || i < 0 || j >= this.size || i >= this.size)
            return false;
        else {
            Node p1 = this.head;
            for (int k = 0; k < i - 1; k++) {
                p1 = p1.next;
            }
            Node p2 = this.head;
            for (int k = 0; k < j - 1; k++) {
                p2 = p2.next;
            }
            Node p3 = p1.next.next;
            Node p4 = p2.next.next;
            Node pI = p1.next;
            Node pJ = p2.next;
            p1.next = pJ;
            pJ.next = p3;
            p2.next = pI;
            pI.next = p4;
            return true;
        }
    }
    public Node getNodeAt(int index){
        if(head == null || index<0 || index >= size){
            return null;
        }
        else{
            Node p = this.head;
            int counter =0;
            while(counter < index){
                p=p.next;
                counter ++;
            }
            return p;
        }
    }
    public void addAt(String data, int index){
        if(this.head == null || index <0 || index >= this.size) {
            return;
        }
        else if(this.head.next == null) {
            this.add(data);
            return;
        }else if(index == 0){
            Node p = this.head;
            Node toAdd = new Node(data);
            this.head = toAdd;
            toAdd.next = p;
            return;
        }
        Node toAdd = new Node(data);
        Node p = this.head;
        int count = 1;
        while(count<index){
            p = p.next;
            count ++;
        }
        Node p1 = p.next;
        p.next = toAdd;
        toAdd.next = p1;
        return;
    }
    public void addInOrder(String data){
        if(this.head == null) {
            this.head = new Node(data);
            return;
        }

        if(data.length() < head.data.length()){
            Node p = this.head;
            Node toAdd = new Node(data);
            this.head = toAdd;
            toAdd.next = p;
        }
        else{
            Node p = this.head;
            while(p.next!= null  ){
                if(p.next.data.length() > data.length()){
                    Node temp = p.next;
                    Node toAdd = new Node(data);
                    p.next = toAdd;
                    toAdd.next = temp;
                    return;
                }
                p= p.next;
            }
            add(data);
            return;
        }
    }
    public void sort(){
        if(head == null|| this.head.next == null)
            return;
        else{
            MyLinkedList ll =new MyLinkedList();
            Node p = this.head;
            while(p.next != null){
                ll.addInOrder(p.data);
                p=p.next;
            }
            ll.addInOrder(p.data);
            this.head = ll.head;
        }
    }


}
