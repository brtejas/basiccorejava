import java.util.Iterator;
import java.util.Vector;

public class Collection4 {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(21);
        v.add(22);
        v.add(23);
        v.add(24);
        System.out.println("Vector is:");
        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
