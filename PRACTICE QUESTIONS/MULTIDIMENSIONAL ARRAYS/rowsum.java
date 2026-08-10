import java.util.Scanner;
public class rowsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter Matrix:");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=sc.nextInt();
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++)
                sum+=arr[i][j];
            System.out.println("Row "+(i+1)+" Sum = "+sum);
        }
    }
}
