import java.util.*;
public class pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows you want to enter: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Time Complexity => O(N²)  
// Space Complexity => O(1) space is only required for loop variables no further extra space is required

