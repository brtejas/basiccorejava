public class ExceptionHandling6 {
    public static void main(String[] args) {
        try {
            int i = 50 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Can't Divide by zero");
        } catch (ArrayIndexOutOfBoundsException aei) {
            System.out.println("Array Index out of bound");
        } catch (RuntimeException re) {
            System.out.println("Error during runtime");
        }
    }
}
