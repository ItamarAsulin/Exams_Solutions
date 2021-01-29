package test;

public class MyLinkedList {
    private Node head;
    private int size;
    public MyLinkedList(){
        head = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public void add(int data){
        if (head == null){
            head = new Node(data);
        }
        else{
            Node n = head;
            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(new Node(data));
        }
        size++;
    }
    public String toString(){
        if(this.head == null)
            return "{ }";
        else{
            Node p = this.head;
            String ans = "{ ";
            while(p.getNext() != null){
                ans += p.getData() + " , ";
                p=p.getNext();
            }
            ans += p.getData()+ " }";
            return ans;
        }
    }
    public void sort() {
        if (head == null){
            return;
    }
        if(head.getNext() == null){
            return;
        }
        else{
            int [] a = new int[this.size];
            int count = 0;
            Node p = this.head;
            while(p.getNext() != null){
                a[count] = p.getData();
                count ++;
                p= p.getNext();
            }
            a[count ] = p.getData();
            for (int i = 0; i <a.length ; i++) {
                for (int j = 0; j <a.length ; j++) {
                    if(a[i]<a[j]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            MyLinkedList ll = new MyLinkedList();
            for (int i = 0; i <a.length ; i++) {
                ll.add(a[i]);
            }
            this.head = ll.head;
            }
        }
    }




