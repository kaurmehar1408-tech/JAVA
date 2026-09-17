import java.util.*;
public class nestedtrycatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero handled.");
            }

            int[] a = {10, 20, 30};
            System.out.println(a[5]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index handled.");
        }

    }
}
