import java.util.*;
public class deletecharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ob = sc.nextLine();
        StringBuffer sb = new StringBuffer(ob);
        sb.delete(5,9);
        System.out.println(sb);
    }
}
