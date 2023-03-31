import java.util.ArrayList;

public class Collection10 {
    int id;
    String name;
    int quantity;

    public Collection10(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public static void main(String[] args){
        ArrayList<Collection10> al=new ArrayList<Collection10>();
        Collection10 c1=new Collection10(101,"Strings",10);
        Collection10 c2=new Collection10(102,"java",20);
        Collection10 c3=new Collection10(103,"python",30);
        al.add(c1);
        al.add(c2);
        al.add(c3);
        for(Collection10 c:al){
            System.out.println(c.id+" "+c.name+" "+c.quantity);
        }

    }
}

