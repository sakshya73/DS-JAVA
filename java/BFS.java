package com.ds;
import java.util.*;
public class BFS
{
    int v;
    LinkedList<Integer> list[];
    public BFS(int v)
    {
        this.v = v;
        list = new LinkedList[v];
        for(int i = 0;i<v;i++)
        {
            list[i] = new LinkedList<>();
        }
    }
    private void addEdge(BFS graph,int u,int v)
    {
        graph.list[u].add(v);
    }
    private void BFSTrav(int start)
    {
        
    }
}