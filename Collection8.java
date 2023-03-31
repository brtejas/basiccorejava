import java.util.Iterator;
import java.util.TreeSet;

public class Collection8 {
    public static void main(String[] args){
        TreeSet ts=new TreeSet();
        ts.add("Run");
        ts.add("Walk");
        ts.add("Talk");
        ts.add("Dodge");
        Iterator itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
