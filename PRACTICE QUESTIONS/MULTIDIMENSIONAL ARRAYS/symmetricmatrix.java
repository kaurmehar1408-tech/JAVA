import java.util.Scanner;
public class symmetricmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter Matrix:");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=sc.nextInt();
        boolean symmetric=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]!=arr[j][i]){
                    symmetric=false;
                    break;
                }
            }
        }
        if(symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}