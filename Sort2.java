import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort2 {
    public static void main(String[] args){
        ArrayList<Student1> al=new ArrayList<>();
        al.add(new Student1(21,"Adithya"));
        al.add(new Student1(23,"Tejas"));
        System.out.println("Sorting Array: ");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student1 st=(Student1)itr.next();
            System.out.println(st.age+" "+st.name);
        }
    }
}
