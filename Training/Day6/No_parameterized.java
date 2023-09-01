package Day6;

public class No_parameterized
{
    String name;
    int roll_no;
    int age;
    No_parameterized(){
        name = "James Gosling";
        roll_no = 99;
        age = 69;
    }
    
    public static void main(String[] args)
    {
        No_parameterized np = new No_parameterized();
        System.out.println("Name:"+np.name+"Roll Number:"+np.roll_no+"Age:"+np.age);
    }
    
}
