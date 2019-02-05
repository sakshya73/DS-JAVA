import java.util.*;
class Histogram
{
    private static int getArea(int hist[])
    {
        int area =0,maxarea=0,dist,i;
        Stack<Integer> stk = new Stack<>();
        for(i=0;i<hist.length;)
        {
            if(stk.isEmpty() || hist[i]>=hist[stk.peek()])
            {
                stk.push(i);
                i++;
            }
            else
            {
                int d = stk.pop();
                dist = (stk.isEmpty())?i:(i-stk.peek()-1);
                area = hist[d] * dist;
                if(area > maxarea)
                    maxarea = area;
            }
        }
        while(!stk.isEmpty())
        {
                int d = stk.pop();
                dist = (stk.isEmpty())?i:(i-stk.peek()-1);
                area = hist[d] * dist;
                if(area > maxarea)
                   maxarea = area;
        }
        return maxarea;
    }
    public static void main(String args[])
    {
        int a[] = new int[]{6, 2, 5, 4, 5, 1, 6};
        System.out.println(getArea(a));
    }
}