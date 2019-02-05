/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class insertion{
    public static void main(String args[])
    {
        int a[]=new int[]{5,2,5,2,1,5,6,9};
        int i;
        for(i=1;i<a.length;i++)
        {
            int hole=i;
            int value=a[i];
            while(a[hole-1]>value && hole>0)
            {
                a[hole]=a[hole-1];
                hole--;
            }
            a[hole]=value;
        }
        for(int j:a)
            System.out.println(j);
    }
}
