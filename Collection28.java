import java.util.Hashtable;
import java.util.Map;

public class Collection28 {
    public int id;
    public String name;
    public double quantity;

    public Collection28(int id, String name, double quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args){
        Map<Integer,Collection28> ht=new Hashtable<>();
        Collection28 c1=new Collection28(101,"JAVA",10);
        Collection28 c2=new Collection28(102,"PYTHON",20);
        Collection28 c3=new Collection28(103,"PROGRAMMING",30);
        ht.put(1,c1);
        ht.put(2,c2);
        ht.put(3,c3);
        for(Map.Entry<Integer,Collection28> map:ht.entrySet()){
            int key=map.getKey();
            Collection28 c=map.getValue();
            System.out.println(c.id+" "+c.quantity+" "+c.name);
        }
    }
}
