public class ThreadExample2 {
    public static void main(String[] args){
        new ThreadExample1("1st");
        new ThreadExample1("2nd");
        new ThreadExample1("3rd");
        try{
            Thread.sleep(8000);
        }catch(InterruptedException ie ){
            System.out.println("Interuption Occurs in main thread");
        }
        System.out.println("We are exiting from main thread");
    }
}
