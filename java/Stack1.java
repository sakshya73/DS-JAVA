package com.ds;
import java.util.*;
class Stack1
{
    int top;
    int a[];
    Stack1(int n)
    {
        a= new int[n];
        top = -1;
    }
    boolean isEmpty(Stack1 s)
    {
        return s.top==-1;
    }
    boolean isFull(Stack1 s)
    {
        return s.top == s.a.length;
    }
    void push(Stack1 s,int e)
    {
        s.a[++s.top] = e;
    }
    int pop(Stack1 s)
    {
        return s.a[s.top--];
    }
    int peek(Stack1 s)
    {
        return s.a[s.top];
    }
    public static void main(String args[])
    {
        Stack1 s = new Stack1(5);
        s.push(s,1);
        s.push(s,2);
        s.push(s,3);
        s.push(s,4);
        System.out.println(s.peek(s));
        System.out.println(s.pop(s));
        System.out.println(s.pop(s));
    }
}