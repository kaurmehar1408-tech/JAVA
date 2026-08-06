import java.util.*;
public class replacewordwithanother {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        int start = sb.indexOf("World");

        if(start != -1){
            sb.replace(start,start + 5,"java");
        }
        System.out.println(sb);
    }
}
