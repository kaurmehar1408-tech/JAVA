import java.util.ArrayList;
import java.util.HashSet;

public class uniquelements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        HashSet <Integer> unique = new HashSet<>(list);
        System.out.println(unique);
    }
}
