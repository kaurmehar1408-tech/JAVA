import java.util.*;
public class panagrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase(); 
        boolean[] present = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; 
                present[index] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("It is a pangram!");
        } else {
            System.out.println("It is NOT a pangram.");
        }
    }
}
