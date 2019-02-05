package com.ds;
import java.util.*;
public class AdjacencyList
{
    int v;
    LinkedList<Integer> list[];
    AdjacencyList(int v)
    {
        list = new LinkedList[v];
        this.v=v;
        for(int i=0;i<v;i++)
        {
            list[i] = new LinkedList<>();
        }
    }
    static void addEdge(AdjacencyList l,int u,int v)
    {
        l.list[u].add(v);
        l.list[v].add(u);
    }
    static void printList(AdjacencyList G)
    {
        for(int i=0;i<G.v;i++)
        {
            System.out.print("Head ->");
            for(Integer a:G.list[i])
                System.out.print(a);
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        AdjacencyList graph = new AdjacencyList(10);
        addEdge(graph,0,4);
        addEdge(graph,1,4);
        addEdge(graph,2,1);
        addEdge(graph,5,4);
        addEdge(graph,2,3);
        printList(graph);
    }
}