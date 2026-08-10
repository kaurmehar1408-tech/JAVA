import java.util.Scanner;
public class identitymatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter Matrix:");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=sc.nextInt();
        boolean identity=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j && arr[i][j]!=1)
                    identity=false;
                if(i!=j && arr[i][j]!=0)
                    identity=false;
            }
        }
        if(identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not Identity Matrix");
    }
}
