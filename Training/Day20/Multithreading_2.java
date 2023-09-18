package Day20;

class Hi_1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Hello_1 implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
public class Multithreading_2 {
    public static void main(String[] args) {
        Runnable obj1 = new Hi_1();
        Runnable obj2 = new Hello_1();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
    
}