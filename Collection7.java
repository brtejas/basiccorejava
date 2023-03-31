import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection7 {
    public static void main(String[] args){
        LinkedHashSet lhs =new LinkedHashSet();
        lhs.add(21);
        lhs.add(786);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.containsAll(lhs));
        Iterator itr= lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
