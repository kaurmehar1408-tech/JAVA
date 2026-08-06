import java.util.*;
public class capacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial Capacity: "+ sb.capacity());
        sb.append("JavaProgrammingLanguage");
        System.out.println("After Append Capacity: "+ sb.capacity());
        System.out.println("Length = "+sb.length());
    }
}
