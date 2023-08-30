package Day8;
class Parent{
    protected void display(){
        System.out.println("Batch 2");
    }
}
 class Protected_Access extends Parent{
    public static void main(String[] args) {
        Protected_Access p1 = new Protected_Access();
        p1.display();
    }
    
}
