package Day22;

public class Wrapper {
    public static void main(String[] args) {
        int i = 100;
        int a = 2000;
        Integer iobj = Integer.valueOf(i);//Normal Boxing
        Integer iobj1 = a;//This automatically converts primitive data type to a Wrapper class or we can also name it as autoboxing!!!
        System.out.println(iobj);
        System.out.println(iobj1);
        System.out.println(iobj+iobj1);
    }
}
