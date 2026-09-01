import java.util.ArrayList;

public class removeelement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Before clear: " + list);

        list.clear();

        System.out.println("After clear: " + list);
        System.out.println("Size: " + list.size());
    }
} 