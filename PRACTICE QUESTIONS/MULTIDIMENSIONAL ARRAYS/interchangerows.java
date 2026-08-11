import java.util.Scanner;
public class interchangerows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int temp;
        for (int j = 0; j < 3; j++) {
            temp = arr[0][j];
            arr[0][j] = arr[2][j];
            arr[2][j] = temp;
        }
        System.out.println("After Swapping Rows:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}