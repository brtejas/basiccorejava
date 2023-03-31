import java.util.SortedMap;
import java.util.TreeMap;

public class Collection21 {
    public static void main(String[] args){
        SortedMap<Integer,String> sm=new TreeMap<>();
        sm.put(101,"Adithya");
        sm.put(102,"Rohit");
        sm.put(103,"Vikas");
        sm.put(104,"Arun");
        System.out.println("The headMap is: "+sm.headMap(102));
        System.out.println("The TailMap is: "+sm.tailMap(103));
        System.out.println("The SubMap is: "+sm.subMap(101,103));
    }
}
