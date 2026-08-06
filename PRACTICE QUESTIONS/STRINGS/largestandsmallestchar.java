import java.util.*;
public class largestandsmallestchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char largest = str.charAt(0);
        char smallest = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>largest){
                largest = str.charAt(i);
            }
            if(str.charAt(i)<smallest){
                smallest = str.charAt(i);
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
    }
}
