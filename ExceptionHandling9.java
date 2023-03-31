public class ExceptionHandling9 {
    public static void main(String[] args){
        try{
            try{
                int i=50/0;

            }catch(ArithmeticException ae){
                System.out.println("Can't / By Zero");
            }
            try{
                int arr[]=new int[4];
                arr[4]=10;
            }catch(ArrayIndexOutOfBoundsException aei){
                System.out.println("Array index not found");
            }
        }catch(Exception e){
            System.out.println("Parent Exception Occured ");
        }
        System.out.println("Rest of code executed");
    }
}
