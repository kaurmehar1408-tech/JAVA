import java.util.ArrayList;

public class commonelements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        for(Integer x: list1){
            if(list2.contains(x)){
                System.out.println(x);
            }
        } 
    }
}
    