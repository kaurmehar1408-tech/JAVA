import java.util.*;
public class firstlastoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);
        if(first == -1){
            System.out.println("Charcter not found");
        }
        else{
            System.out.println("First occurence = "+ first);
            System.out.println("Last occurence = "+ last);
        }
    }
}
