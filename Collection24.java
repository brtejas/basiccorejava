import java.util.Hashtable;
import java.util.Map;

public class Collection24 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Avinash");
        ht.put(102,"Rohit");
        ht.put(103,"Amit");
        ht.put(104,"Shyam");
        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
