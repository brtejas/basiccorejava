public class Strings2 {
    public static void main(String[] args){
        String s="Sachin";
        s=s.concat("Tendulkar");
        System.out.println(s);
        String s1="Sachin Tendulkar";
        String s2="Sachin Tendulkar";
        String s3="saurav Ganguly";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s.trim());
        System.out.println(s.startsWith("Sa"));
        System.out.println(s.endsWith("r"));
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.length());
        int a=10;
        s=String.valueOf(a);
        System.out.println(s+a);
        String s4="java java java java";
        String s5=s4.replace("java","Mava");
        System.out.println(s5);
    }
}
