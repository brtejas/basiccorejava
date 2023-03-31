import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Tejas");
        al.add("Avinash");
        al.add("Vikas");
        al.add("Sagar");
        al.add("Raj");
        System.out.println("ArrayList is:");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
