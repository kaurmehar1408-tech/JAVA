import java.util.*;
public class multipleexceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {10,20,30,40,50};
        try{
        System.out.println("Enter index you want to search");
        int index = sc.nextInt();
        System.out.println("Enter divisor: ");
        int div = sc.nextInt();
        System.out.println("Result: "+100/div);
        System.out.println("Element: "+nums[index]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
    }
}
