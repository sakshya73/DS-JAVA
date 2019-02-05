import java.util.*;
class selection
{
    static void selecsort(int a[])
    {
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
    static void bubble(int a[])
    {
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    static void insertion(int a[])
    {
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            int hole = i;
            int value = a[i];
            while( hole>0 && a[hole-1] > value)
            {
                a[hole]=a[hole-1];
                hole--;
            }
            a[hole] = value;
        }
    }
    static void mergesort(int a[],int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i] = a[i+l];
        }
        for(int j=0;j<n2;j++)
        {
            R[j] = a[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    static void sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            mergesort(a,l,m,r);
        }
    }
    static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int a[] = new int[]{12,11 ,13 ,5 ,6 ,7};
        //selecsort(a);
        //bubble(a);
        //insertion(a);
        sort(a,0,a.length-1);
        printarray(a);
    }
}