public class Student implements Comparable<Student>{
     public String name;
    @Override
    public int compareTo(Student person) {
        return name.compareTo(person.name);
    }
    public Student(String name){
        this.name=name;
    }
}
