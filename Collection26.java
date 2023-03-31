import java.util.Hashtable;

public class Collection26 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Sudeep");
        ht.put(102,"Darshan");
        ht.put(103,"Yash");
        ht.put(104,"SriMurali");
        System.out.println(ht.getOrDefault(100,"NotFound"));
        System.out.println(ht.getOrDefault(101,"NotFound"));

    }
}
