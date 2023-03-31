import java.util.LinkedHashSet;

public class Collection12 {
    public static void main(String[] args){
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Sagar");
        lhs.add("Vikas");
        lhs.add("Rohit");
        lhs.add("Enrique");
        System.out.println("The HashSet is:"+lhs);
        System.out.println(lhs.remove("Rohit"));
        System.out.println("After removing object from list:"+lhs);
        System.out.println(lhs.remove("For"));
    }
}
