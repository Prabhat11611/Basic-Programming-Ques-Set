
// Enter 3 numbers from the user & make a function to print their average

import java.util.*;
public class Question1 {
    public static void average(float a, float b, float c){
        float average = ((a+b+c)/3);
        System.out.print(average);
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float a = sc.nextInt();
        System.out.print("Enter your second number: ");
        float b= sc.nextInt();
        System.out.print("Enter your third number: ");
        float c= sc.nextInt();

        average(a,b,c);
    }
}
