import java.util.ArrayList;

public class findelementbyindex{
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Rahul");
        names.add("Simran");
        names.add("Neha");

        String search = "Simran";

        int index = names.indexOf("Simran");
        if(index != -1){
            System.out.println(search + " found at index "+ index);
        }
        else{
            System.out.println("Record not found");
        }
    }
}