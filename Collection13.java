import java.util.TreeSet;

public class Collection13 {
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        System.out.println("Initial Set: "+ts);
        System.out.println("Reversed Set: "+ts.descendingSet());
        System.out.println("Head Set: "+ts.headSet("B",true));
        System.out.println("Sub Set: "+ts.subSet("A",false,"E",true));
        System.out.println("Tail Set: "+ts.tailSet("E",true));
    }
}
