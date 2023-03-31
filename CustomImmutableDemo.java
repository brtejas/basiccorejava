public class CustomImmutableDemo  {
    public static void main(String[] args){
        Employee e=new Employee("ABCDE000000");
        String s1=e.getPanCardNo();
        System.out.println("PanCard Number: "+s1);
    }
}
