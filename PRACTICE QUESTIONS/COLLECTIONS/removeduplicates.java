import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        list.add(12);
        list.add(43);
        list.add(3);
        list.add(67);
        list.add(23);
        list.add(43);
        list.add(21);
        list.add(90);
        list.add(67);
        list.add(3);
        System.out.println(list);
        for(Integer x: list){
            set.add(x);
        }
        System.out.println(set);

    }
}
