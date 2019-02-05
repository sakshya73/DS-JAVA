import java.util.*;
class Stock
{
    private static void stockspan(int price[],int span[])
    {
        Stack<Integer> stk = new Stack<>();
        span[0] = 1;
        stk.push(0);
        for(int i=1;i<price.length;i++)
        {
            while(!stk.isEmpty() && price[stk.peek()] <= price[i])
                stk.pop();
            span[i] = (stk.isEmpty())?(i+1):(i-stk.peek());
            stk.push(i);
        }
        for(int i =0;i<span.length;i++)
            System.out.println(span[i]);
    }
    public static void main(String args[])
    {
        int price[] = new int[]{10, 4, 5, 90, 120, 80};
        int span[] = new int[price.length];
        stockspan(price,span);
    }
}