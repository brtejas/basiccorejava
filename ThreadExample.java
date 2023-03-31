public class ThreadExample extends Thread {
    public void run(){
        int a=10;
        int b=20;
        int result=a+b;
        System.out.println("Thread started running");
        System.out.println("The Sum of two numbers is: "+result);
    }
    public static void main(String[] args){
        ThreadExample t1=new ThreadExample();
        t1.start();

    }
}
