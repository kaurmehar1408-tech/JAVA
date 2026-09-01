import java.util.*;
public class appendmultiplevalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ob = sc.nextLine();
        StringBuffer sb = new StringBuffer(ob);
        sb.append(" Java");
        sb.append(" is");
        sb.append(" easy");
        sb.append(" to");
        sb.append(" learn.");
        System.out.println(sb);
    }
}
