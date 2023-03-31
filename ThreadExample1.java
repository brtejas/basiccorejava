public class ThreadExample1 implements Runnable {
    String name;
    Thread thread;

    public ThreadExample1(String name) {
        this.name = name;
        thread=new Thread(this,name);
        System.out.println("A new "+thread+" is created/n");
        thread.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }


        }catch(InterruptedException ie){
            System.out.println(name+" thread interuptted");
        }
        System.out.println(name+ " thread exiting ");
    }
}
