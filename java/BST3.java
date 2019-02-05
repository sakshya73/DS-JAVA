package com.ds;

import java.util.*;
import java.lang.*;

public class BST3
{
    class Node
    {
        int min,max,data;
    };
     boolean isBST(int arr[],int n)
    {
        if(n==0)
            return true;
        int i=0;
        Queue<Node> q = new PriorityQueue<Node>();
        Node newNode=new Node();
        newNode.data = arr[i++];
        newNode.min=-9999;
        newNode.max = 9999;
        q.push(newNode);
        while(i!=n && !q.empty())
        {
            Node temp = q.front();
            q.pop();
            if(i<n && (arr[i]<temp.data && arr[i]>temp.min))
            {
                newNode.data = arr[i++];
                newNode.min=temp.min;
                newNode.max=temp.data;
            }
            if(i<n && (arr[i]>temp.data && arr[i]<temp.max))
            {
                newNode.data = arr[i++];
                newNode.max=temp.max;
                newNode.min=temp.data;
            }
        }
        if(i==n)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        BST3 tree = new BST3();
        int arr[] = new int[]{7,4,12,3,6,8,1,5,10};
        boolean res=tree.isBST(arr,arr.length);
        if(res==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}