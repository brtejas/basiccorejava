import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.age-o2.age;
    }

}

