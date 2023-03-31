import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection30 {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(11);
        l.add(111);
        l.add(1111);
        l.add(11111);
        System.out.println("The maximum value is: "+ Collections.max(l));
        System.out.println("The minimum value is: "+Collections.min(l));
        Collections.sort(l);
        System.out.println("The Sorted Collection is: ");
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("The Sorted Collection in reverse order is: ");
        Collections.sort(l,Collections.reverseOrder());
        Iterator itr1=l.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
