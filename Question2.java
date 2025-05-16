
// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Question2{
    public static int sum(int n){
        int add=0;
        for(int i=1; i<=n; i++){
            if (i%2!=0){
                add+=i;
            }
        }
        return add;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till where you want your number to be added: ");
        int n=sc.nextInt();

        int result = sum(n);
        System.out.println("Sum of odd numbers from 1 to "+n+": "+result);
    }
}
