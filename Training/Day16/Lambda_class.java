package Day16;
@FunctionalInterface
interface Yoyo{
    void display(int i);
}
public class Lambda_class {
    public static void main(String[] args) {
        Yoyo A = (int i)->System.out.println("Team Hii!!");
        A.display(69);
    }
}
