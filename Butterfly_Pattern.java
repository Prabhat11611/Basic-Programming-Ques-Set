// import java.util.*;

// public class A_new {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         System.out.println("The text enterd is: "+ name);
//     }
// }


public class Butterfly_Pattern {
    public static void main(String arg[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For Lower Half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}