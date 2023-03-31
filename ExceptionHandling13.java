public class ExceptionHandling13 {
    public void m() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException("Array Index not Found");
    }
    public static void main(String[] args){
        ExceptionHandling13 e13 =new ExceptionHandling13();
        try {
            e13.m();
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Index not found");

        }
    }
}
