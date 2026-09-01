import java.util.*;
public class intersectionofsets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(30);
        set2.add(40);
        set2.add(50);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}
