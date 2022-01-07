package Impleminting_LinkedList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList {
    private Node first;
    private Node last;


    public  boolean insert_at_First(int data) {
        Node temp;
        Node new_node = new Node(data);
        if (first == null) {
            first = new_node;
            last=new_node;
            return true;
        }
        else {
            temp=first;
            first = new_node;
            new_node.nextNodeRef=temp;
            return true;
        }
    }
    public Node deleteLastNode()
    {
        if(first==null)
        {
            return null;
        }
        if(first!=null && first.nextNodeRef==null)
        {
            first=null;
            return first;
        }
        Node node= first;
        while (node.nextNodeRef!=null)
        {
            if(node.nextNodeRef.nextNodeRef==null)
            {
                last=node.nextNodeRef;
               node.nextNodeRef=null;
               break;
            }
             node=node.nextNodeRef;
        }
        return last;
    }
    public boolean add_at_last(int data)       //[10->20->30->40]
    {
        Node newNode = new Node(data);          // output coming [10,40]
        if(first==null) {
            return insert_at_First(data);
        }
        Node node = first;
        if (node == last) {
            node.nextNodeRef = newNode;
            last = newNode;
//            newNode.nextNodeRef = null;
            return true;
        }
        while (node.nextNodeRef != null) {
            if (node.nextNodeRef == last) {
                last = newNode;
                node.nextNodeRef.nextNodeRef = newNode;
                break;
            }
            node = node.nextNodeRef;
        }
        return true;
    }
    public boolean delete_value(int value_to_delete)
    {
        Node node = first;
        while (node.data!=value_to_delete)
        {
            if(node.nextNodeRef.data==value_to_delete)
            {
                node.nextNodeRef = node.nextNodeRef.nextNodeRef;
                break;
            }
            node = node.nextNodeRef;
        }
        return true;
    }
    public Node deleteFirstNode()
    {
        if(first.nextNodeRef==null)
        {
            return deleteLastNode();
        }
        if(first==null)
        {
            return null;
        }
        first = first.nextNodeRef;
        return first;

    }
    public void displayList()
    {
        Node temp = first;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.nextNodeRef;

        }

    }
    public boolean add(int data)
    {
        Node temp;
        Node newnode=new Node(data);


        return true;
    }
    public boolean add_at_Position(int data, int at_position) {
        Node node = new Node(data);

        int count=1;
        if(first==last)
        {
            first.nextNodeRef=node;
            last=node;
            return true;
        }
        Node oldNode = first;
        while (oldNode.nextNodeRef != null)
        {
            if(count==(at_position-1))
            {
                Node temp = oldNode.nextNodeRef;
                oldNode.nextNodeRef=node;
                node.nextNodeRef=temp;
                break;
            }
            count++;
            oldNode=oldNode.nextNodeRef;
        }
        return true;
    }
}
