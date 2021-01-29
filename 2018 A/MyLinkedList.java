package Test;

public class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(String data){
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
                ans = ans + n.data + ", ";
                n = n.next;
            }
            ans = ans + n.data +"]";
        }
        return ans;
    }
    public boolean swap(int i, int j){
        int smallerIndex = Math.min(i,j);
        int biggerIndex = Math.max(i,j);
        if(this.size < i +1 || this.size < j +1) {
            System.err.println("Index out of bounds.");
            return false;
        }
        else{
            Node prevSmallerNode = this.head;
            for (int k = 0; k < smallerIndex ; k++) {
                prevSmallerNode = prevSmallerNode.next;
            }
            Node prevBiggerNode = this.head;
            for (int k = 0; k < biggerIndex ; k++) {
                prevBiggerNode = prevBiggerNode.next;

            }
            Node help = new Node(prevSmallerNode);
            prevSmallerNode.setData(prevBiggerNode.getData());
            prevBiggerNode.setData(help.getData());
            return true;

        }
    }
}

