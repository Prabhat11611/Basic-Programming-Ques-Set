// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class Question8 {
    public static double calc(int base, int power){
        return Math.pow(base,power);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base=sc.nextInt();
        System.out.print("Enter the Power Value: ");
        int power=sc.nextInt();

        double result = calc(base,power);
        System.out.print("The result is: "+result);
    }
}
