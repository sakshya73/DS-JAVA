package com.ds;
public class BST
{
    class Node
    {
        Node left;
        Node right;
        int key;
        int value;
        Node(int k,int v)
        {
            left = null;
            right = null;
            key = k;
            value = v;
        }
    };
    Node root;
    public BST()
    {
        root = null;
    }
    public int isEmpty()
    {
        if(root == null)
            return 1;
        return 0;
    }
    public void put(int key,int value)
    {
        if(root == null)
            root = new Node(key,value);
        if(root.key == key)
        {
            root.value = value;
            return;
        }
        else if(root.key < key)
            root.right = new Node(key,value);
        else if(root.key > key)
            root.left = new Node(key,value);
        
    }
    public int get(int key)
    {
        return get(root,key);
    }
    private int get(Node x,int key)
    {
        if(x == null)
            return 0;
        if(x.key == key)
            return x.value;
        if(x.key < key)
            return get(x.right,key);
        return get(x.left,key);
    }
    public void inorder()
    {
        inorderrec(root);
    }
    public void postorder()
    {
        postorderrec(root);
    }
    public void preorder()
    {
        preorderrec(root);
    }
    private void inorderrec(Node root)
    {
        if(root == null)
            return;
        inorderrec(root.left);
        System.out.println(root.key + " " + root.value);
        inorderrec(root.right);
    }
    private void preorderrec(Node root)
    {
        if(root == null)
            return;
        System.out.println(root.key + " " + root.value);
        preorderrec(root.left);
        preorderrec(root.right);
    }
    private void postorderrec(Node root)
    {
        if(root == null)
            return;
        postorderrec(root.left);
        postorderrec(root.right);
        System.out.println(root.key + " " + root.value);
    }
}