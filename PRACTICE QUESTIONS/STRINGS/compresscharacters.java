import java.util.*;
public class compresscharacters{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder res = new StringBuilder();
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(i < str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
            }
            else{
                res.append(str.charAt(i));
                res.append(count);
                count = 1;

            }
        }
        System.out.println("Result: "+ res);
    }
}