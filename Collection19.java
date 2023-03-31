import java.util.Map;
import java.util.TreeMap;

public class Collection19 {
    public static void main(String[] args){
        TreeMap<Integer,String> tm=new TreeMap();
        tm.put(101,"Adithya");
        tm.put(102,"Vikas");
        tm.put(103,"Rohit");
        tm.put(104,"Raj");
        System.out.println("Before Removing an element: ");
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        tm.remove(103);
        System.out.println("After removing an element: ");
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
