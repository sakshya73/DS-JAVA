package com.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class BstWord
{
    class Node
    {
        int count;
        Node left;
        Node right;
        String key;
        int value;
        Node(String k)
        {
            left = null;
            right = null;
            key = k;
            value = 1;
            count = 1;
        }
    };
    Node root;
    public BstWord()
    {
        root = null;
    }
    public int isEmpty()
    {
        if(root == null)
            return 1;
        return 0;
    }
    public void size()
    {
        
    }
    private Node putrec(String key , Node n){
        if(n == null){
            n = new Node(key);
            return n;
        } 
        else if(n.key.compareTo(key) < 0)
            n.right = putrec(key , n.right);
        
        else if(n.key.compareTo(key) > 0)
            n.left = putrec(key , n.left);
        
        else{
            n.value++;
            return n;
        } 
        n.count = 1 + size(n.left) + size(n.right);
        return n;
    }
    public void put(String key)
    {
       root =  putrec(key, root);
    }
    public int get(String key)
    {
        return get(root,key);
    }
    private int get(Node x,String key)
    {
        if(x == null)
            return 0;
        else if(x.key.compareTo(key) == 1)
            return get(x.left,key);
        else if (x.key.compareTo(key) == -1)
            return get(x.right,key);
        if(x.key.equals(key));
            return x.value;
 
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
    int maxfreq()
    {
        return maxfreqrec(root).value;
    }
    Node maxfreqrec(Node root)
    {
        if(root == null)
            return null;
        maxfreqrec(root.left);
        if(root.value > max)
        {
            max = root.value;
            m = root;
        }
        maxfreqrec(root.right);
        return m;
    }
    int max = 0;
    Node m;
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner s = new Scanner(new File("C:\\Users\\HP\\Desktop\\leipzig1m.txt"));
        BstWord b = new BstWord();
        while(s.hasNextLine())
        {
            String line = s.nextLine();
            for(String word : line.split(" "))
            {
                if(word.length() >= 10)
                    b.put(word);
            }
        }
       //b.inorder();
       System.out.println(b.maxfreq());
    }
    
}