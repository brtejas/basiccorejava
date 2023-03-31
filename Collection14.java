import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection14 {
    public static void main(String[] args){
        HashMap hm=new HashMap();
        hm.put(1,"Amit");
        hm.put(2,"Rohit");
        hm.put(3,"Vikas");
        hm.put(4,"Tejas");
        hm.put(5,"Sagar");
        hm.put(6,"Avinash");
        System.out.println("The Map Elements are: "+hm);
        Set s=hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
