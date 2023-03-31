import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection29 {
    public static void main(String[] args){
        List<String> l=new ArrayList<>();
        l.add("C");
        l.add("C++");
        l.add("JAVA");
        System.out.println("THE LIST OF BOOKS IS: "+l);
        Collections.addAll(l,"Servlet","JSP");
        System.out.println("THE UPDATED LIST OF BOOKS IS: "+l);
        String[] addStr={".NET","C#"};
        Collections.addAll(l,addStr);
        System.out.println("THE UPDATED LIST OF BOOK IS: "+l);


    }
}
