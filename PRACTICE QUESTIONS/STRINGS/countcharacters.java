import java.util.*;
// COUNT CHARACTERS
public class countcharacters{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0;
        int spaces = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                letters++;
            }
            else if(ch == ' '){
                spaces++;
            }
        }
        System.out.println("Letters: "+ letters);
        System.out.println("Spaces: "+ spaces);
    }
}