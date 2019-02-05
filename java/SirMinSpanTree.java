package com.ds;
import java.util.ArrayList;
import java.util.Scanner;

public class SirMinSpanTree
{
    class Edge
    {
        int src;
        int dest;
        int weight;
    }
    class Subset
    {
        int parent;
        int rank;
    }
    class Graph
    {
        int vertex;
        ArrayList<Edge> E;
    }
    class Kruskal
    {
        Graph g;
        Subset s[];
        Kruskal(int v , int e)
        {
            g = new Graph();
            g.vertex = v;
            g.E = new ArrayList<>();
            s = new Subset(v);
        }
    }
    public static void main(String args[])
    {
        int v,e;
        Scanner s = new Scanner(System.in);
        v = s.nextInt();
        e = s.nextInt();
        
    }
}