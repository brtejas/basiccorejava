import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){

        try {
            File f0=new File("C:\\Users\\Tejas Rajkumar\\OneDrive - Tarento\\Desktop");
            if(f0.createNewFile()){
                 System.out.println("File "+f0.getName()+" is created successfully");
            }else{
                System.out.println("File already exists ");
            }
        } catch (IOException e) {
            System.out.println("UnExpected Error Occured");
            e.printStackTrace();
        }
    }
}
