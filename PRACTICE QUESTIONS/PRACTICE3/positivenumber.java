import java.util.*;
public class positivenumber {
    static void check(int num){
            if(num < 0){
                throw new IllegalArgumentException("Number is negative");
            }
            System.out.println("Number is positive");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            check(n);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
