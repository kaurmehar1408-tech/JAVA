
import java.util.*;
public class secondfrequentcharacter {
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
    int first = 0;
    int second = 0;
    char firstchar = ' ';
    char secondchar = ' ';
    for(int i=0;i<256;i++){
        if(freq[i]>first){
            second = first;
            secondchar = firstchar;
            first = freq[i];
            firstchar = (char)i;
        }
        else if(freq[i]>second && freq[i] != first){
            second = freq[i];
            secondchar = (char)i;
        }   }
    System.out.println("Second most frequent character: "+ secondchar);
   } 
}