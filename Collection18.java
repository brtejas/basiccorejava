import java.util.LinkedHashMap;

public class Collection18 {
    public static void main(String[] args){
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(101,"Adithya");
        lhm.put(102,"Vikas");
        lhm.put(103,"Rohit");
        lhm.put(104,"Vinay");
        System.out.println("Key Value pairs are: "+lhm.entrySet());
        lhm.remove(103);
        System.out.println("Key Value Pairs are: "+lhm.entrySet());
    }
}
