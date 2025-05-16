import java.util.*;
public class functions{
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Number.");
            return;
        }
        int factorial=1; 
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();

        factorial(a);
    }
}