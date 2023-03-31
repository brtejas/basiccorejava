import java.util.HashMap;
import java.util.Map;

public class Collection15 {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Aman");
        map.put(102,"Vikas");
        map.put(103,"Rohit");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
