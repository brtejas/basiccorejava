public class Wrapper {
    public static void main(String[] args){
        byte b=2;
        int i=90;
        short s=30;
        long l=40;
        float f=50.0f;
        double d=60.0;
        char c='a';
        Byte b1=b;
        Short s1=s;
        Integer i1=i;
        Character c1=c;
        Long l1=l;
        Double d1=d;
        System.out.println(b1+" "+s1+" "+i1+" "+c1+" "+l1+" "+d1);
        byte b2=b1;
        short s2=s1;
        int i2=i1;
        double d2=d1;
        char c2=c1;
        long l2=l1;
        System.out.println(b2+" "+s2+" "+i2+" "+c2+" "+l2+" "+d2);
    }
}
