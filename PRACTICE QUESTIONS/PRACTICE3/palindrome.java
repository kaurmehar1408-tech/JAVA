import java.util.*;
public class palindrome {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ob = sc.nextLine();
    StringBuffer sb = new StringBuffer(ob);
    String rev = sb.reverse().toString();

    if(ob.equalsIgnoreCase(rev)){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not A Palindrome");
    }
   } 
}
