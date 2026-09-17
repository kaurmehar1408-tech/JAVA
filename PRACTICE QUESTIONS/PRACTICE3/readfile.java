import java.util.*;
import java.io.*;
public class readfile {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("File Error: "+e.getMessage());
        }
    }
}
