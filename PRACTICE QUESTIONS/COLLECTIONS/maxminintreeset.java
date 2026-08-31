import java.util.TreeSet;

public class maxminintreeset {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        set.add(11);
        set.add(25);
        set.add(32);
        set.add(41);
        set.add(15);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
