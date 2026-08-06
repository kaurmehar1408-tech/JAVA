import java.util.*;
public class splitsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word: words){
            System.out.println(word);
        }
    }
}
