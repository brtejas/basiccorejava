public class ExceptionHandling2 {
    public static void main(String[] args){
        try{
            int a=50/0;
            System.out.println("Exception Raised");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception Handled");
            int a=50/2;
            System.out.println(a);
        }
    }
}
