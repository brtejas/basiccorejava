import java.util.Hashtable;
import java.util.Map;

public class Collection23 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
        ht.put(101,"Rohit");
        ht.put(102,"Vikas");
        ht.put(103,"Sagar");
        ht.put(104,"Kalyan");
        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
