public class ExceptionHandling8 {
    public static void main(String[] args){

        try{
            String s=null;
            System.out.println(s.length());
        }catch(ArithmeticException ae){
            System.out.println("/ By Zero");
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Array index not found ");
        }catch(Exception e){
            System.out.println("Parent Exception occured");
        }

    }
}
