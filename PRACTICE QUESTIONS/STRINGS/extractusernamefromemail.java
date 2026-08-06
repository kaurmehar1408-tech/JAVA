import java.util.*;
public class extractusernamefromemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        int index = email.indexOf('@');

        if(index == -1){
            System.out.println("Invalid Email");
        }
        else{
            System.out.println("Username = "+ email.substring(0,index));
        }
    }
}
