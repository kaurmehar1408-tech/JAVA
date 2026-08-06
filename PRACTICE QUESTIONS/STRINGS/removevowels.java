import java.util.*;
public class removevowels {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ("AEIOUaeiou".indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println("After Removing Vowels:");
        System.out.println(sb);
    } 
}
