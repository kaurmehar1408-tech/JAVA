import java.util.*;
public class maxinarraylist {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max = list.get(0);
        for(Integer x : list){
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);

    }
}
