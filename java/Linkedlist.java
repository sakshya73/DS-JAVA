package com.ds;
public class Linkedlist
{
    private class Node
    {
        Node next;
        int data;
        
        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    Linkedlist()
    {
        head = null;
    }
    void insertNodeAtBeg(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    void insertNodeAtLast(int data)
    {
        Node temp = new Node(data);
        temp.next = null;
        Node last = head;
        if(head == null)
        {
            head = temp;
            return;
        }
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = temp;
    }
    void delAtBeg()
    {
        head = head.next;
    }
    void delAtEnd()
    {
        Node last = head;
        Node prev = head;
        while(last.next != null)
        {
            prev = last;
            last = last.next;
        }
        prev.next = null;
    }
    
    void delAtGivenPos(int pos)
    {
        if (head == null) 
            return; 
        Node temp = head; 
        if (pos == 0) 
        { 
            head = temp.next; 
            return; 
        }  
        for (int i=0; temp != null && i < pos - 1; i++) 
            temp = temp.next;  
        if (temp == null || temp.next == null) 
            return;  
        Node next = temp.next.next; 
        temp.next = next;
    }
    
    void printList()
    {
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String args[])
    {
        Linkedlist l = new Linkedlist();
        l.insertNodeAtBeg(10);
        l.insertNodeAtBeg(20);
        l.insertNodeAtLast(40);
        l.insertNodeAtLast(50);
        l.delAtBeg();
        l.delAtEnd();
        l.delAtGivenPos(1);
        l.printList();
    }
}