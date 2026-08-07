import java.util.*;
public class findduplicatecharacters {
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine().toLowerCase();
    int freq[] = new int[256];
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        freq[ch]++;
    }
    for(int i=0;i<256;i++){
        if(freq[i]>1){
            System.out.println((char)(i));
        }
    }
   } 
}
