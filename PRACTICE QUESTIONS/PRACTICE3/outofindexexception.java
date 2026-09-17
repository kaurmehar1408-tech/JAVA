import java.util.*;
public class outofindexexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {10,20,30,40,50};
        System.out.println("Enter index of the element you want to search: ");
        int index = sc.nextInt();
        try{
            System.out.println("Element: "+nums[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
}
