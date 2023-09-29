package Day26;

public class Lazy_singleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                Kunal obj = Kunal.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                Kunal obj2 = Kunal.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}
class Kunal{
    static Kunal obj;
    private Kunal(){
     System.out.println("I think I am listening!!");   
    }

    public static Kunal getInstance(){
        if(obj == null){
            obj = new Kunal();
        }
        //obj = new Kunal();
        return obj;
    }
}
