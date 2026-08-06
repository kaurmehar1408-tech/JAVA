import java.util.*;
public class appendname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sb.append("Name: ");
        sb.append(name);
        sb.append(" Age: ");
        sb.append(age);
        System.out.println(sb);
    }
}
