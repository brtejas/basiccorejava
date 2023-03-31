import java.util.Iterator;
import java.util.LinkedList;

public class Collection2 {
    public static void main(String[] args){
        LinkedList ll= new LinkedList();
        ll.add(21);
        ll.add("Tejas");
        ll.add(2.23);
        ll.add("Raju");
        ll.add(21000);
        System.out.println("Linked list is:" );
        Iterator itr=ll.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
