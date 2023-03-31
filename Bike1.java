public class Bike1 extends Bike {
    @Override
    void run() {
       System.out.println("maximum running time");
    }
    public static void main(String[] args){
        Bike1 b1=new Bike1();
        b1.run();
    }
}
