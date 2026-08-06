import java.util.*;
public class largeststringalphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String largest = "";
        System.out.println("Enter any 3 strings: ");
        for(int i=1;i<=3;i++){
            String str = sc.nextLine();
            if(i==1 || str.compareTo(largest)>0){
                largest = str;
            }
        }
        System.out.println("Largest: "+ largest);
    }
}
