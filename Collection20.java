import java.util.*;

public class Collection20 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> nm = new TreeMap<Integer, String>();
        nm.put(101,"Vikas");
        nm.put(102,"Rohit");
        nm.put(103,"Adarsh");
        nm.put(104,"Praveen");
        System.out.println("The Descending Map is: "+nm.descendingKeySet());
        System.out.println("Head Map: "+nm.headMap(102,true));
        System.out.println("Tail Map: "+nm.tailMap(103,false));
        System.out.println("Sub Map: "+nm.subMap(102,false,104,true));
    }
}
