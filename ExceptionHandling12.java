public class ExceptionHandling12 {
    public int Divide(int m,int n)throws ArithmeticException{
        int div=m/n;
        return div;
    }
    public static void main(String[] args){
        ExceptionHandling12 e12=new ExceptionHandling12();
        try{
          System.out.println(e12.Divide(45,0));
        }catch(ArithmeticException ae){
            System.out.println("Can't Divide By Zero");
        }
        System.out.println("Rest Of Code");
    }
}
