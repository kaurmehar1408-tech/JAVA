import java.io.CharConversionException;
import java.util.*;
public class countvowcon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        str = str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                digits++;
            }
            else if(Character.isLetter(ch)){
                if(ch =='a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if(ch != ' '){
                special++;
            }
        }
        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Digits: "+ digits);
        System.out.println("Special: "+ special);

    }
}
