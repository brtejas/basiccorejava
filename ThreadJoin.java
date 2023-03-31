public class ThreadJoin extends Thread {
    public void run(){
        for(int j=0;j<2;j++){
            try{
                Thread.sleep(300);
            }catch(Exception e){
                System.out.println("The exception has been caught "+e);
            }
            System.out.println(j);
        }
    }
}
