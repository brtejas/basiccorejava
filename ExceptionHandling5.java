import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling5 {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jpg.txt");
            System.out.println("saved");
        } catch (FileNotFoundException fe) {
            System.out.println(fe);
        }
        System.out.println("File saved successfully");
    }

}

