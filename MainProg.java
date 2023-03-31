public class MainProg {
    public static void main(String[] args){
        Parent p=new Child();
        p.name="Rohit";
        Child c=(Child)p;
        c.age=20;
        System.out.println(c.name+" "+c.age);
        c.message();

    }
}
