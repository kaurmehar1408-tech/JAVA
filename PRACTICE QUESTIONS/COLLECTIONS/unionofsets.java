import java.util.*;
public class unionofsets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(30);
        set2.add(40);
        set2.add(50);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
    }
}
