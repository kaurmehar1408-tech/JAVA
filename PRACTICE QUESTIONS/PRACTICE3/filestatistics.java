import java.util.*;
import java.io.*;
public class filestatistics {
   public static void main(String[] args) {
    int lines = 0;
    int characters = 0;
    int words = 0;

    try{
        BufferedReader file = new BufferedReader(new FileReader("students.txt"));
        String line;
        while((line = file.readLine())!=null){
            lines++;
            characters += line.length();

            String[] wordlist = line.trim().split("\\s+");

            if(!line.trim().isEmpty()){
                words += wordlist.length;
            }
        }
        file.close();
        System.out.println("Lines = "+lines);
        System.out.println("Words = "+words);
        System.out.println("Characters = "+characters);
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
   } 
}
