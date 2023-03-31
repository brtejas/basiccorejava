public class ObjectClone implements Cloneable {
    int rollno;
    String name;

    public ObjectClone(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args){
        try{
            ObjectClone o1=new ObjectClone(101,"Tejas");
            ObjectClone o2=(ObjectClone)o1.clone();
            System.out.println(o1.rollno+" "+o1.name);
            System.out.println(o2.rollno+" "+o2.name);
        }catch(CloneNotSupportedException e){

        }
    }
}
