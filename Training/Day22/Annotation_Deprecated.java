package Day22;
class A_A{
    void msg(){
        System.out.println("HELLO TEAM!!");
    }
    @Deprecated //it discourages the use of following method it gives the warning when we are printing the method!!! 
    void print(){
        System.out.println("ITS WORKING!!");
    }
}

public class Annotation_Deprecated {
    public static void main(String[] args) {
        A_A obj = new A_A();
        obj.msg();
        obj.print();
    }
}
