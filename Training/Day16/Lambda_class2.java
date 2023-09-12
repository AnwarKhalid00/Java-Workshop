package Day16;
@FunctionalInterface
interface Addable{
    int add(int a,int b);
}
public class Lambda_class2 {
    public static void main(String[] args) {
        Addable plus = (a,b)->(a+b);
        System.out.println(plus.add(4, 56));
        Addable plus_2 = (int a ,int b)->{
            return(a+b);
        };
        System.out.println(plus_2.add(76, 4));
    }
}
