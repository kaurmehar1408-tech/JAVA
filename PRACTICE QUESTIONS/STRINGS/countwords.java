import java.util.*;
public class countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().trim();
        if(str.isEmpty()){
            System.out.println("Words = 0");
            return;
        }
        String words[] = str.split("\\s+");
        System.out.println("Words = "+ words.length);
    }
}
