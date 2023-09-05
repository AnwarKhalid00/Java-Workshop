package Day13;

interface marker
{
    
}
class Output implements marker
{
        public void show_output()
        {
            System.out.println("I understood the marker interface!!");
        }

}
public class Marker_interface {
    public static void main(String[] args) {
        Output out = new Output();
        if (out instanceof marker){
            out.show_output();
        }
        else{
            System.out.println("You are wromg!!!");
        }
    }
    
}
