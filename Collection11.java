import java.util.HashSet;

public class Collection11 {
    public static void main(String[] args){
        HashSet hs=new HashSet();
        hs.add("Ravi");
        hs.add("Sujay");
        hs.add("Rohit");
        hs.add("Tejas");
        System.out.println("The Elements of HashSet are:"+hs);
        hs.remove("Sujay");
        System.out.println("After removing a Object:"+hs);
        HashSet hs1=new HashSet();
        hs1.add("Gaurav");
        hs1.add("Amit");
        hs.addAll(hs1);
        System.out.println("The Elements of HashSet are:"+hs);
        hs.removeAll(hs1);
        System.out.println("The Elements of HashSet are:"+hs);
        hs.clear();
        System.out.println("The Elements of HashSet are:"+hs);

    }
}
