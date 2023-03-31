import java.util.HashSet;
import java.util.Iterator;


public class Collection6 {
    public static void main(String[] args){
        HashSet hs= new HashSet();
        hs.add("Java");
        hs.add("Python");
        hs.add("Data Structures");
        hs.add("Computer Graphics");
        System.out.println(hs.contains("Java"));
        System.out.println(hs.size());
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
