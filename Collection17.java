import java.util.LinkedHashMap;

public class Collection17 {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer, String>();
        lhm.put(101,"Tejas");
        lhm.put(102,"Vikas");
        lhm.put(103,"Rohit");
        lhm.put(104,"Amin");
        System.out.println("Keys are: "+lhm.keySet());
        System.out.println("Values are: "+lhm.values());
        System.out.println("Key-Value Pairs: "+lhm.entrySet());
    }
}
