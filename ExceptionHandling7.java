public class ExceptionHandling7 {
    public static void main(String[] args){
        try{
            int arr[]={1,2,3,4,5,6};
            System.out.println(arr[10]);
        }catch(ArithmeticException ae){
            System.out.println("/ by zero");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("index out of bound");
        }catch(Exception e){
            System.out.println("exception will occur");
        }
    }
}
