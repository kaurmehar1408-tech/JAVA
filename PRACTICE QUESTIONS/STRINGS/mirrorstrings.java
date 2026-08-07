import java.util.*;
public class mirrorstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();
        String reverse = new StringBuilder(s1).reverse().toString();
        if (reverse.equals(s2))
            System.out.println("Mirror Images");
        else
            System.out.println("Not Mirror Images");
    }
}