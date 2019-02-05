import java.util.*;
class Infix
{
    static int prec(char a)
    {
        switch(a)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static void infix(String s)
    {
        String res="";
        Stack<Character> stk = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c >= 'a'&& c <= 'z' || c>='A' && c<='Z')
                res+=c;
            else if(c == '(')
                stk.push(c);
            else if(c == ')')
            {
                while(!stk.isEmpty() && stk.peek()!='(')
                {
                    res+=stk.pop();
                }
                if(!stk.isEmpty() && stk.peek()!='(')
                {
                    System.out.print("Invalid");
                    return;
                }
                else
                   stk.pop();
            }
            else
            {
                while(!stk.isEmpty() && prec(c) <= prec(stk.peek()))
                {
                    res+=stk.pop();
                }
                stk.push(c);
            }
        }
        while(!stk.isEmpty())
        {
            res+=stk.pop();
        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        infix(s);
    }
}