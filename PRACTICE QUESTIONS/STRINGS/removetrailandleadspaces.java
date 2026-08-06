import java.util.*;
public class removetrailandleadspaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            str = str.trim();
        }
        System.out.println(str);
    }
}
