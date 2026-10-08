package LinkedList;

public class LList {

    private Node head;
    private Node tail;
    private int size;
    private class Node{

        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public LList() {
      this.size=0;
    }

}
