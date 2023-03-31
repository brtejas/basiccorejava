import java.util.ArrayList;
import java.util.Iterator;

public class Collection9 {
    public int rollno;
    public String name;
    public double marks;

    public Collection9(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args){
        Collection9 c1=new Collection9(101,"Rose",23);
        Collection9 c2=new Collection9(102,"Jasmine",25);
        Collection9 c3=new Collection9(103,"Sunflower",24);
        ArrayList<Collection9> al=new ArrayList<Collection9>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Collection9 cl=(Collection9)itr.next();
            System.out.println(cl.rollno+" "+cl.name+" "+cl.marks);
        }
    }
}
