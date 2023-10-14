package Practice1;

public class Array_Practice {
    public static void main(String[] args) {
        int [] arr = new int [] {12,48,655,654,59};
        int max = 0;
        for(int i = 0; i<arr.length;++i){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The greatest integer in the array is: "+max);
    }
}
