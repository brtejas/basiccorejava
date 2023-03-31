import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection16 {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(101,"VIKAS");
        map.put(102,"TEJAS");
        map.put(103,"ROHIT");
        System.out.println("Iterating map objects: ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("The Updated list is: ");
        map.replace(103,"ROHAN");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated List is: ");
        map.replaceAll((k,v)->"TEJAS");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
