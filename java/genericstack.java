import java.util.*;
public class genericstack<E> {
Stack <E> stk = new Stack <>();
public void push(E obj) {
stk.push(obj);
}
public E pop() {
E obj = stk.pop();
return obj;
}
}
class Output {
public static void main(String args[]) {
genericstack <String> gs = new genericstack<>();
gs.push("Hello");
System.out.print(gs.pop() + " ");
genericstack <Integer> g = new genericstack<>();
g.push(36);
System.out.println(g.pop());
}
}