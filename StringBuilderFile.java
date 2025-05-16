import java.util.*;
public class StringBuilderFile {
    public static void main(String arg[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // CharAt
        System.out.println(sb.charAt(2));

        // Set charAt index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // Insert Function
        sb.insert(0,"S");
        System.out.println(sb);

        // Delete Function
        sb.delete(1,2);
        System.out.println(sb);

        // Append
        sb.append(" ");
        sb.append("T");
        sb.append("V");
        System.out.println(sb);

        // Length
        System.out.println(sb.length());
    }
}
