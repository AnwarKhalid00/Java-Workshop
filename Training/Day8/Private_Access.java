package Day8;
class Data{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Private_Access {
    public static void main(String[] args) {
        Data d = new Data();
        d.setName("Khalid");
        System.out.println(d.getName());
    }
    
}
