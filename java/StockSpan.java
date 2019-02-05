
import java.util.Stack;

class StockSpan
{
    static void calculateSpan(int[] price,int[] span)
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        span[0]=1;
        for(int i = 1;i<price.length;i++)
        {
            while(!stk.isEmpty() && price[stk.peek()]<=price[i])
                stk.pop();
            span[i]=(stk.isEmpty())?(i+1):(i-stk.peek());
            stk.push(i);
        }
        for(int i=0;i<span.length;i++)
        {
            System.out.print(span[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int price[] = new int[]{2,1,6,3,9,4};
        int span[] = new int[10];
        calculateSpan(price,span);
    }
}