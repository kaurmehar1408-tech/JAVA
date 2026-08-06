import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            rev += ch;
        }
        System.out.println("Reverse of the string is: "+rev);
    }
}
