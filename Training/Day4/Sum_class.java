package Day4;

public class Sum_class {
    public int addNumbers(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        Sum_class obj = new Sum_class();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is:"+result);
    }
    
}
