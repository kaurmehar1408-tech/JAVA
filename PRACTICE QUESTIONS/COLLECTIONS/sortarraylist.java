import java.util.*;
public class sortarraylist {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}