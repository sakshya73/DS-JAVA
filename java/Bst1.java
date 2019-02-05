package com.ds;
class Student
{
    int age;
    String name;
    int id;
    Student()
    {
        
    }
    Student(int age,String name,int id)
    {
        this.age = age;
        this.name = name;
        this.id = id;
    }
}
public class Bst1 extends Student implements Comparable
{
    private class Node
    {
        Node left;
        Node right;
        int data;
        Node()
        {
            left = null;
            right = null;
        }
    }
    Node root;
    
    public int compareTo(Student s1) {
        if(this.age > s1.age )
            return 1;
        else if(this.age < s1.age)
            return -1;
        return 0;
    }
    Node createNode(Student key)
    {
        Node temp = new Node();
        temp.data = key;
        return temp;
    }
    public void insert(K key, V value) {
		root = insert(root, key, value);
	}
    Node insert(Node root,Student key)
    {
        if(root==null)
            return createNode(key);
        if(root.data < key)
            root.right=insert(root.right,key);
        else if(root.data>key)
            root.left=insert(root.left,key);
        return root;
    }
    
}