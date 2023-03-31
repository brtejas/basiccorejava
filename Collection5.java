import java.util.Iterator;
import java.util.PriorityQueue;

public class Collection5 {
    public static void main(String[] args){
        PriorityQueue q=new PriorityQueue<>();
        q.add("Tejas");
        q.add("Rahul");
        q.add("Ananya");
        q.add("Rohit");
        q.add("yashaswini");
        System.out.println("The iterated queue is: ");
        Iterator itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println("----------");
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println("---------");
        System.out.println("The re-iterated queue is:");
        Iterator itr1=q.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


    }
}
