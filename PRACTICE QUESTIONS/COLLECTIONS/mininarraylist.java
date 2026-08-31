import java.util.*;
public class mininarraylist {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int min = list.get(0);
        for(Integer x : list){
            if(x < min){
                min = x;
            }
        }
        System.out.println(min);

    }
}
