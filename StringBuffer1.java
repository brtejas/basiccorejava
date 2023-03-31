public class StringBuffer1 {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Mava");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.delete(1,3);
        System.out.println(sb);
    }
}
