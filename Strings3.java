public class Strings3 {
    int rollno;
    String name;
    String sub;
     Strings3(int rollno,String name,String sub){
        this.rollno=rollno;
        this.name=name;
        this.sub=sub;
    }
    public String toString(){
         return rollno+" "+name+" "+sub;
    }
    public static void main(String[] args){
         Strings3 s3=new Strings3(101,"TEJAS","English");
         System.out.println(s3);
    }
}
