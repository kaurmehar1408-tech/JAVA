import java.util.*;
class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
public class MarksValidation{
    static void checkmarks(int marks)throws InvalidMarksException{
        if(marks < 0 || marks > 100)
            throw new InvalidMarksException("Marks should be in between 0 to 100");
        System.out.println("Valid marks: "+ marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try{
            checkmarks(marks);
        }
        catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }
    }
}