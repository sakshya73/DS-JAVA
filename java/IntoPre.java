import java.util.*;
class IntoPre
{
    static String PretoIn(String s)
    {
        Stack<String> stk = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z' || c>='A' && c<='Z')
                    stk.push(c+"");
            else
            {
                String a = stk.pop();
                String b = stk.pop();
                String res = '('+a+c+b+')';
                stk.push(res);
            }
        }
        return stk.peek();
    }
    public static void main(String args[])
    {
        String s ="*-A/BC-/AKL";
        System.out.println(PretoIn(s));
    }
}