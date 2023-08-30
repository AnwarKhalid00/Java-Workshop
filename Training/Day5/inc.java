package Day5;



public class inc {
    public static void main(String[] args) {
        
        System.out.println("value a is 5");
        int a =5;
        System.out.println("value b is 7");
        int b =7;
        System.out.println("Performing pre increment");
        System.out.println("Pre increment value of a");
        System.out.println(++a);
        
        System.out.println("Performing pre decrement");
        System.out.println("Pre decrement value of b");
        System.out.println(--b);
        
        System.out.println("Performing post increment");
        System.out.println("Post increment value of a");
        System.out.println(a++);
        System.out.println(a++);
       
        System.out.println("Performing post decrement");
        System.out.println("Post decrement value of b");
        System.out.println(b--);
        System.out.println(b--);
    }
        
}
