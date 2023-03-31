public class ExceptionHandling11 {
    public void validate(int age){

        if(age<18){
            throw new ArithmeticException("Person is not Eligible for voting");
        }else{
            System.out.println("Person can vote...!!");
        }
    }
    public static void main(String[] args){
       ExceptionHandling11 e11=new ExceptionHandling11();
       e11.validate(21);
       System.out.println("Rest is NOTA....!!!");
    }
}
