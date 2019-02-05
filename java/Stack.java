package com.ds;
public class Stack
{
    int top;
    int size;
    char a[];
    public Stack()
    {
        top = -1;
        size = 1;
        a = new char[size]; 
    }
    public boolean isFull()
    {
        return a.length == size;
    }
    public boolean isEmpty()
    {
        return top < 0;
    }
    private void resize(int newSize)
    {
        char b[] = new char[newSize];
        for(int i = 0; i < size; i++)
        {
            b[i]=a[i];
        }
        size = newSize;
        a = b;
        
    }
    public void push(char data)
    {
        if(isFull())
        {
            resize(size * 2);
        }
        a[++top] = data;
    }
    public char peek()
    {
        return a[top];
    }
    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top--];
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push('a');
        s.push('b');
        s.push('c');
        s.pop();
        System.out.println(s.peek());
        s.pop();
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}