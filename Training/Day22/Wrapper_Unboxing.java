package Day22;

public class Wrapper_Unboxing {
    public static void main(String[] args) {
        Integer iobj = new Integer(550);
        int i = iobj.intValue();//Unboxing
        int j = iobj;//Autounboxing
        System.out.println(i+j);
    }
    
}
