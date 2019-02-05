package com.ds;
public class Trie {
    private Node root;
    class Node{
        private Object key;
        private Object value;
        private Node[] n;
        public Node(){
            key = null;
            value = null;
            n = new Node[256];
        }
    }
    public Trie(){         
        root = new Node();
    }
    public void insert(String Key, String value){
        root = insert(Key,value,root,0);
        //System.out.println("Inserted!");
    }
    private Node insert(String Key, Object value, Node x, int d){
        if(x == null)
            x = new Node();
        if(Key.length() == d){
            x.value = value;
            return x;
        }
        char c = Key.charAt(d);
        x.n[c] = insert(Key,value,x.n[c], d+1);
        return x;     
    }
    public void get(String Key){
        String res = "";
        root = search(res,Key, root, 0);
    }
    private Node search(String res, String Key, Node x, int ind){
        if(x == null){
            System.out.println("Not found :(");
            return x;
        }
        if(ind == Key.length()){
            System.out.println("FOUND :D");
            System.out.println("Key : "+res+" Value : "+x.value);
            return x;
        }        
        char c = Key.charAt(ind);        
        res += c;
        x.n[c] = search(res, Key, x.n[c], ind+1);
        return x;
    }
    public static void main(String args[])
    {
        
    }
}