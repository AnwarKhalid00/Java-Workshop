package Day21;

public class Multithreading_lambda {
    public static void main(String[] args) 
    {
        Runnable obj1 = ()->
        {
             for(int i = 0;i<5;i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        
                    }
                }
            
        };
        Runnable obj2 = ()->
        {
            for(int i = 0;i<5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        
                    }
                }
            
        };
        Thread t1 = new Thread(obj1);
        t1.start();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
    
}
