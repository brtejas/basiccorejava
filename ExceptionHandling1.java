public class ExceptionHandling1 {
    public static void main(String[] args){
        try{
            int a=100/0;
        }
        catch (Exception e){
            System.out.println(e);
            int a=100/2;
            System.out.println(a);
            System.out.println("Exception Handled");
        }
    }
}
