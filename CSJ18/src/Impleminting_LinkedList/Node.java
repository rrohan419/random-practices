package Impleminting_LinkedList;

public class Node {
    int data;
    Node nextNodeRef;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node nextNodeRef) {
        this.data = data;
        this.nextNodeRef = nextNodeRef;
    }
}
