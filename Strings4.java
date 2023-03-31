import java.util.StringTokenizer;

public class Strings4 {
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("My Name is Khan");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
