import java.util.*;
public class checkpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str =sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            rev += ch;
        }
        if(str.equals(rev)){
            System.out.println("Yes it's a palindrome");
        }
        else{
            System.out.println("No, it's not a palindrome");
        }
    }
}
