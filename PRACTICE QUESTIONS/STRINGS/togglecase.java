import java.util.*;
public class togglecase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String ans="";
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch >= 'A' && ch <= 'Z'){
            ans += (char)(
                ch + 32);
        }
        if(ch >= 'a' && ch <= 'z'){
            ans += (char)(
                ch - 32);
        }
        else{
            ans+=ch;
        }
    }
    System.out.println(ans);
    }
}
