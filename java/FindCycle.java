package com.ds;
import java.util.*;
public class FindCycle 
{
	enum color
	{
		WHITE,
		GREY,
		BLACK
	};
	
	static class Graph 
	{
		int vertices;
		int edges;
		color id[];
		List<List<Integer>> list = new LinkedList();
		public Graph(int v , int e)
		{
			vertices = v;
			edges = e;
			id = new color[v];
			for(int i = 0; i < v; i++)
			{
				list.add(new LinkedList<Integer>());
				id[i] = color.WHITE;
			}
		}
		void dfsFunc(int source)
		{
			//System.out.println(source);
			id[source] = color.GREY;
			Iterator<Integer> it = list.get(source).iterator();
			while(it.hasNext())
			{
				int x = it.next();
				if(id[x] == color.WHITE)
					dfsFunc(x);
			}
			
			id[source] = color.BLACK;
			
		}
	
		boolean findCycle(int source , int parent)
		{
			id[source] = color.GREY;
			Iterator<Integer> it = list.get(source).iterator();
			while(it.hasNext())
			{
				int x = it.next();
				if(id[x] == color.WHITE)
					if(findCycle(x, source))
						return true;
				else
				{
					if(x != parent) {
						return true;     // It means there is and edge from grey to grey which means CYCLE exists
					}
				}
			}
			
			
			id[source] = color.BLACK;
			return false;
			
		}
	}
	
	
	public static void main(String[] args)
	{
		Graph g = new Graph(5 , 14);
		g.list.get(0).add(3);
		g.list.get(0).add(2);
		g.list.get(0).add(4);
		g.list.get(1).add(4);
		g.list.get(1).add(3);
		g.list.get(2).add(0);
		g.list.get(2).add(3);
		g.list.get(3).add(2);
		g.list.get(3).add(0);
		g.list.get(3).add(4);
		g.list.get(3).add(1);
		g.list.get(4).add(0);
		g.list.get(4).add(3);
		g.list.get(4).add(1);
		boolean val = g.findCycle(0, -1);
		if(val == true)
			System.out.println("Cycle exists");
		else
			System.out.println("Cycle does not exist");
		
		
		
	}
}