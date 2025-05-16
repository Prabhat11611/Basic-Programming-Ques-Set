// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;
public class Question10 {
    public static int printFibonacci(int n){
        for(int i=0; i<=n; i++){
            System.out.print(i);
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();

        printFibonacci(n);
    }
}
