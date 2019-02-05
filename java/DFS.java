package com.ds;
import java.util.Iterator;
import java.util.LinkedList;
public class DFS{
    int v;
    LinkedList<Integer> list[];
    DFS(int v)
    {
        this.v = v;
        list = new LinkedList[v];
        int i;
        for(i=0;i<v;i++)
        {
            list[i] = new LinkedList<>();
        }
    }
    void addEdge(int src,int dest)
    {
        list[src].add(dest);
    }
    void DFSUtil(int s,boolean visited[])
    {
        visited[s] = true;
        System.out.print(s+ " ");
        Iterator<Integer> itr = list[s].iterator();
        while(itr.hasNext())
        {
            int n = itr.next();
            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }
    void DFStrav(int s)
    {
        boolean visited[] = new boolean[v];
        DFSUtil(s,visited);
    }
    public static void main(String args[])
    {
        DFS d = new DFS(5);
        d.addEdge(0, 1); 
        d.addEdge(0, 2); 
        d.addEdge(1, 2); 
        d.addEdge(2, 0); 
        d.addEdge(2, 3); 
        d.addEdge(3, 3);
        d.DFStrav(2);
    }
}