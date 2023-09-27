package Day25;
import java.util.*; 
public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(9);
        st.push(27);
        st.push(56);
        st.push(98);
        st.push(12);
        System.out.println("Elements in Stack: "+st);
        System.out.println("Deleting top element: "+st.pop());//deletes and returns the top element in the stack
        System.out.println("Reamining elements in Stack: "+st);
        System.out.println("Top element in Stack: "+st.peek());//returns the top element in the stack
        System.out.println("Searching for 27 in Stack: "+st.search(27));//returns the position of the element from the top of the stack
    }
}
