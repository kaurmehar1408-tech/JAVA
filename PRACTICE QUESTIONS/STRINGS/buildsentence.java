import java.util.*;
public class buildsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        sb.append("My name is ");
        sb.append(name);
        sb.append(". ");

        sb.append("I am studying ");
        sb.append(course);
        sb.append(".");

        System.out.println(sb);
    }
}
