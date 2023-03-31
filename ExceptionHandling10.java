public class ExceptionHandling10 {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println(data);
        } catch (NullPointerException ne) {
            System.out.println("Null Pointer found");
        }
        finally {
            System.out.println("Data Executed Successfully");
        }
        }
    }
