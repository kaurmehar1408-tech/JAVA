import java.util.*;
public class stringbufferoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ob = sc.nextLine();

        StringBuffer sb = new StringBuffer(ob);

        sb.insert(2,"hello");
        System.out.println(sb);

        sb.replace(5,9,"good");
        System.out.println(sb);
    }
}
