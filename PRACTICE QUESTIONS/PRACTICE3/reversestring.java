import java.util.*;
public class reversestring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ob  = sc.nextLine();

        StringBuffer sb = new StringBuffer(ob);
        System.out.println("Before reverse: "+ob);
        System.out.println("After reverse: "+ sb.reverse());
    }
}