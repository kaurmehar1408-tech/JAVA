import java.util.*;
public class reversearraylist {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }
}
