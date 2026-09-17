import java.util.*;
import java.io.*;
public class copyfile {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("students.txt");
            FileWriter writer = new FileWriter("copy.txt");

            int ch;

            while((ch = reader.read())!= -1){
                writer.write(ch);
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully");
        }
        catch(IOException e){
            System.out.println("File Error: "+ e.getMessage());
        }
    }
}
