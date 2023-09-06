package Day14;

public class CommandLine_Question {
    public static void main(String[] args) {
        int size  = args.length;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            int n = Integer.parseInt(args[i]);
            if(arr[i]%2==0)
            {
                System.out.println("-"+n);
            }
           else
           {
            System.out.println("+"+n);
           }
        }

    }
    
}
