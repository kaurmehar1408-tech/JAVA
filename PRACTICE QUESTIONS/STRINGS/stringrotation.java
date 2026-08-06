import java.util.*;
public class stringrotation {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Rotation");
        }
        else if ((s1 + s1).contains(s2)) {
            System.out.println("Rotation");
        }
        else {
            System.out.println("Not Rotation");
        }
    } 
}
