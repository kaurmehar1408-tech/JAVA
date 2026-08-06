import java.util.*;
public class removespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                ans += ch;
            }
        }
        System.out.println(ans);
    }
}
