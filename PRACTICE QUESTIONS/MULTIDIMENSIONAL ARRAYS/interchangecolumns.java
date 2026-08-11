import java.util.Scanner;
public class interchangecolumns {
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
        for (int i = 0; i < 3; i++) {
            temp = arr[i][0];
            arr[i][0] = arr[i][2];
            arr[i][2] = temp;
        }
        System.out.println("After Swapping Columns:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
