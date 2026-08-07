import java.util.*;
public class removeduplicatecharacters {
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine().toLowerCase();
    int freq[] = new int[256];
    String result = "";
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        freq[ch]++;
    }
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(freq[ch]>0){
            result+=ch;
            freq[ch]=0;
        }
    }
    System.out.println(result);
   } 
}