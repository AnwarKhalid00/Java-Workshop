package Day14;

public class cmd_arguments_5 {
    public static void main(String[] args) {

        try{
            if (args.length == 0) {
                throw new IndexOutOfBoundsException("Enter alteast 1 value");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (i % 2 == 0) {
                System.out.println("+" + num);
            } else {
                System.out.println("-" + num);
            }

        }
    }
}