import java.util.*;
public class divisionexception {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    try{
        int res = a/b;
        System.out.println("Result: "+ res);
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }
   } 
}
