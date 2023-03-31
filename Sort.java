import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args){
        ArrayList<Student> l=new ArrayList<Student>();
        l.add(new Student("Vikas"));
        l.add(new Student("Rohit"));
        Collections.sort(l);
        for(Student s:l){
            System.out.println(s.name);
        }
    }
}
