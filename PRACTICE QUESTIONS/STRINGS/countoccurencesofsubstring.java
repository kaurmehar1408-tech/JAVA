import java.util.Scanner;

public class countoccurencesofsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        
        System.out.print("Enter the substring to find: ");
        String subStr = sc.nextLine();
        
        int count = 0;
        int mainLen = mainStr.length();
        int subLen = subStr.length();
        for (int i = 0; i <= mainLen - subLen; i++) {
            String currentChunk = mainStr.substring(i, i + subLen);
            if (currentChunk.equals(subStr)) {
                count++;
            }
        }
        
        System.out.println("The substring appears " + count + " times.");
        sc.close();
    }
}
