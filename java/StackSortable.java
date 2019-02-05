import java.util.*;
class StackSortable
{
    static Queue<Integer> q = new LinkedList<>();
    static boolean checkSorted(int n)
    {
        Stack<Integer> stk = new Stack<>();
        int expected = 1;
        int fnt;
        while(!q.isEmpty())
        {
            fnt = q.poll();
            if(fnt == expected)
                expected++;
            else
            {
                if(stk.isEmpty())
                    stk.push(fnt);
                else if(!stk.isEmpty() && stk.peek()<fnt)
                    return false;
                else
                    stk.push(fnt);
            }
            while(!stk.isEmpty() && stk.peek()==expected)
            {
                stk.pop();
                expected++;
            }
        }
        return expected-1==n && stk.isEmpty();
    }
    public static void main(String args[]) 
    { 
        q.add(5); 
        q.add(1); 
        q.add(2); 
        q.add(6); 
        q.add(3); 
      
        int n = q.size(); 
  
        if (checkSorted(n)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
}