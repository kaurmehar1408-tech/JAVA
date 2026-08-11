import java.util.Scanner;
public class searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == key) {
                    System.out.println(
                        "Element found at Row " + i +
                        ", Column " + j
                    );
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("Element Not Found");
    }
}
