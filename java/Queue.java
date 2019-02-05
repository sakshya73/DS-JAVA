package com.ds;

public class Queue 
{
    
    Linkedlist l ;
   
    public Queue()
    {
        l = new Linkedlist();
    }
    void enqueue(int key)
    {
        l.insertNodeAtLast(key);
    }
    void printlist()
    {
        l.printList();
    }
    void dequeue()
    {
        l.delAtBeg();
    }
    public static void main(String arsgs[])
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.printlist();
    }
}
