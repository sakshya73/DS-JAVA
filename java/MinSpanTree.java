package com.ds;
import java.util.*;
public class MinSpanTree
{
    class Edge
    {
        int weight;
        int src;
        int dest;
        ArrayList<Edge> E= new ArrayList<>();
        public void addEdge(int s,int d,int w)
        {
            Edge obj = new Edge();
            obj.src = s;
            obj.dest = d;
            obj.weight = w;
            E.add(obj);
        }
    }
    class Node
    {
        int rank;
        Node parent;
        int value;
        public void createNode(int v)
        {
            Node n = new Node();
            n.value = v;
            n.rank = 0;
            n.parent = n;
            map.put(v,n);
        }
        public boolean union(int src,int dest)
        {
            Node x = map.get(src);
            Node y = map.get(dest);
            Node parent1 = findParent(x);
            Node parent2 = findParent(y);
            
            if(parent1.value == parent2.value)
            {
                
            }
        }
    }
}