package Test;

public class Node {
    String data;
    Node next;
    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Node other){
        this.data = other.data;
        this.next = other.next;
    }
    public String toString(){
        return data;
    }
}
