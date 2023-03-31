public class ExceptionHandling3 {
    public static void main(String[] args){
        int i=50;
        int j=0;
        try{
          System.out.println(50/0);
        }catch(Exception e){
            System.out.println("Can't Divide By Zero");
            System.out.println(i/(j+2));
        }
    }
}
