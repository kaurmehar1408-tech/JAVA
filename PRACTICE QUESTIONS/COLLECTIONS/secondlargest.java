import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max = list.get(0);
        int second = list.get(0);
        for(Integer x : list){
            if(x > max){
                second = max;
                max = x;
            }
            else if(x != max && x > second){
                second = x;
            }
        }
        System.out.println(second);

    }
}