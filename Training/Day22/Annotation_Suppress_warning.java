package Day22;

import java.util.ArrayList;

public class Annotation_Suppress_warning {
    @SuppressWarnings("unchecked")//After suppresswarning it does not need a data type!!
    public static void main(String[] args) {
        ///ArrayList<String> list = new ArrayList<String>();
        ArrayList list = new ArrayList();
        list.add("BATCH 2");
        list.add("HELLO");
        list.add("TEAM");
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
