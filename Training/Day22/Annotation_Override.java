package Day22;
class A_{
    void msg(){
        System.out.println("HELLO TEAM!!");
    }
}
class B_ extends A_{
    @Override
    void msg(){
        System.out.println("HELLO STUDENTS OF NIET!!");
    }
}

public class Annotation_Override {
    public static void main(String[] args) {
        B_ obj = new B_();
        obj.msg();
    }
}
