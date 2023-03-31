import java.util.Hashtable;

public class Collection27 {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Sadiq");
        ht.put(102,"Darshan");
        ht.put(103,"Vikas");
        ht.put(104,"Rohit");
        ht.put(105,"Adarsh");
        System.out.println("The Initial map is: "+ht.entrySet());
        ht.putIfAbsent(106,"Satyam");
        System.out.println("The Updated Map is: "+ht.entrySet());
    }
}
