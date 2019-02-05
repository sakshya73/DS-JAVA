import java.util.*;
class PostfixEval
{
    static int post(String s)
    {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c==' ')
                continue;
            if(c>='0' && c <='9')
            {
                int num = 0;
                while(c>='0' && c <='9')
                {
                    num = num*10 + (int)(c-'0');
                    i++;
                    c = s.charAt(i);
                }
                i--;
                stk.push(num);
            }
            else
            {
                int c1 = stk.pop();
                int c2 = stk.pop();
                int res=0;
                switch(c)
                {
                    case '*':
                        res = c2*c1;
                        break;
                    case '/':
                        res = c2/c1;
                        break;
                    case '+':
                        res = c2+c1;
                        break;
                    case '-':
                        res = c2-c1;
                        break;
                }
                stk.push(res);    
            }
        }
        return stk.peek();
    }
    public static void main(String args[])
    {
        String s ="100 200 + 2 / 5 * 7 +";
        System.out.println(post(s));
    }
}