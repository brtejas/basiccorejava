import java.util.Iterator;
import java.util.Stack;

public class Collection3 {
    public static void main(String[] args){
        Stack stk=new Stack();
        stk.push("Rose");
        stk.push("Jasmine");
        stk.push("Sunflower");
        stk.push(12);
        System.out.println("The Printed Stack is:");
        Iterator itr=stk.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("One Item is not of type String");
        stk.pop();
        System.out.println("The Re-Printed Stack is: ");
        Iterator itr1=stk.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }
    }
}
