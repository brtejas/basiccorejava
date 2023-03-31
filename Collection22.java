import java.util.Map;
import java.util.TreeMap;

public class Collection22 {
    int id;
    String name;
    int quantity;

    public Collection22(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args){
        Map<Integer, Collection22> tm=new TreeMap<>();
        Collection22 c1= new Collection22(101,"JAVA",10);
        Collection22 c2= new Collection22(102,"PYTHON",20);
        Collection22 c3= new Collection22(103,"PROGRAMMING",30);
        tm.put(2,c2);
        tm.put(1,c1);
        tm.put(3,c3);
        for(Map.Entry<Integer, Collection22> entry:tm.entrySet()){
           int key=entry.getKey();
           Collection22 c=entry.getValue();
           System.out.println(key+" Details: ");
           System.out.println(c.id+" "+c.name+" "+c.quantity);
        }

    }
}
