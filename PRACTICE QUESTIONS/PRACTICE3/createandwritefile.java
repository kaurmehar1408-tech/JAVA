import java.util.*;
import java.io.*;
public class createandwritefile{
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("students.txt");
            file.write("Arun\n");
            file.write("Bala\n");
            file.write("Chitra\n");
            file.write("David\n");
            file.write("Priya\n");
            file.close();
            System.out.println("Data Written Successfully");
        }
        catch(IOException e){
            System.out.println("File error: "+ e.getMessage());
        }
    }
}