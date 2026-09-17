import java.util.*;
public class bankwithdrawal {
    static void Withdrawal(double balance, double amount) throws Exception{
        if(amount > balance){
            throw new Exception("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining balance "+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bank balance");
        int balance = sc.nextInt();
        System.out.println("Enter the amount that you want to withdraw");
        int amount = sc.nextInt();
        try{
            Withdrawal(balance,amount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
