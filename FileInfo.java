import java.io.File;

public class FileInfo {
    public static void main(String[] args){
        File f1=new File("C:\\Users\\Tejas Rajkumar\\OneDrive - Tarento\\Desktop");
        if(f1.exists()){
            System.out.println(" The name of the File is: "+f1.getName());
            System.out.println("The Absolute path of the file is: "+f1.getAbsolutePath());
            System.out.println("Is the file writable: "+f1.canWrite());
            System.out.println("Is the file readable: "+f1.canRead());
            System.out.println("The size of the file in bytes: "+f1.length());
        }else{
            System.out.println("The File doesnot Exists");
        }
    }
}
