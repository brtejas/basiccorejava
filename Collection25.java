import java.util.Hashtable;

public class Collection25 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Adithya");
        ht.put(102,"Vikas");
        ht.put(103,"Rohit");
        ht.put(104,"Shankar");
        System.out.println("Before removal: "+ht.entrySet());
        ht.remove(103);
        System.out.println("After Removal: "+ht.entrySet());
    }
}
