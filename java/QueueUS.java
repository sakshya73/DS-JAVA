import java.util.*;
class QueueUS
{
    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueUS()
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    void enqueue(int item)
    {
        s1.push(item);
    }
    int dequeue()
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            System.out.println("Both Stacks Are Empty");
            return 0;
        }
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public static void main(String args[])
    {
        QueueUS qs = new QueueUS();
        qs.enqueue(7);
        qs.enqueue(8);
        qs.enqueue(9);
        qs.enqueue(6);
        qs.enqueue(5);
        System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());
    }
}