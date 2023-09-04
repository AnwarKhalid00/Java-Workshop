package Day12;


public class Cmd_argument_array 
{
    public static void main(String[] args) 
    {
        int size = args.length;
        
        int arr[] = new int[size];
        
        int max = arr[0];
        for(int i=0;i<size;++i)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0;i<size;++i)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Greatest value is :"+max);
        
        
    } 
}
    
    

