package Day21;

public class Deadlock {
    String s1 = "Nitish";
    String s2 = "Piyush";
    Thread t1 = new Thread(){
        public void run(){
            while(true){
                synchronized(s1){
                    try {
                        System.out.println(Thread.currentThread().getName()+" locked!!"+s1);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(s2){
                        System.out.println(Thread.currentThread().getName()+" locked!!"+s2);
                    }
                }
            }
        }
    };
    Thread t2 = new Thread(){
        public void run(){
            while(true){
                synchronized(s2){
                    try {
                        System.out.println(Thread.currentThread().getName()+" locked!!"+s2);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(s1){
                        System.out.println(Thread.currentThread().getName()+" locked!!"+s1);
                    }
                }
            }
        }
    };
    public static void main(String[] args) {
        Deadlock obj = new Deadlock();
        obj.t1.start();
        obj.t2.start();
    }
}
