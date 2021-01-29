package test;

import java.util.Vector;

public class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList(){
        head = null;
        size = 0;
    }
    public void add(int data){
        if (head == null){
            head = new Node(data);
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = new Node(data);
        }
        size++;
    }
    public String toString(){
        String ans = "[";
        if (head == null) ans = "[]";
        else {
            Node n = head;
            while(n.next != null){
                ans = ans + n.getData() + ", ";
                n = n.next;
            }
            ans = ans + n.getData() +"]";
        }
        return ans;
    }
    public void removeDup(){
       if(head == null){
           return;
       }
       if(this.head.next == null){
           return;
       }
       Vector <Integer> dup = new Vector<>();
       Node p =this.head;
       int a = p.getData();
        while(p.next != null) {
            dup.add(p.getData());
            p= p.next;
        }
        dup.add(p.getData());
        System.out.println(dup.toString());
        for (int i = 0; i <dup.size() ; i++) {
            for (int j = 0; j < dup.size(); j++) {
                if(dup.get(i) == dup.get(j) && i != j){
                    dup.remove(j);
                    j--;
                }
            }
        }
        System.out.println(dup.toString());
          MyLinkedList newLL = new MyLinkedList();
            for (int i = 0; i <dup.size() ; i++) {
                newLL.add(dup.get(i));
            }
            this.head = newLL.head;

        }

    }


